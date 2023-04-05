package com.uc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.businessbean.PickUpBean;
import com.uc.dao.PopulateLocationsDAO;
import com.uc.entity.PickUpEntity;

@Service
public class PopulateLocationService {
	
	@Autowired
	PopulateLocationsDAO ldao;
	
	public List<PickUpBean> populatePickUpLocations(){
		List<PickUpEntity> entityList = new ArrayList<PickUpEntity>();
		List<PickUpBean> beanList = new ArrayList<PickUpBean>();
		PickUpBean bean = new PickUpBean();
		entityList=ldao.findAll();
		for(PickUpEntity entity: entityList) {
			BeanUtils.copyProperties(entity, bean);
			beanList.add(bean);
		}
		return beanList;
		
	}

}
