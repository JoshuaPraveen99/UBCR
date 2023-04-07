package com.uc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.businessbean.DropOffBean;
import com.uc.businessbean.PickUpBean;
import com.uc.dao.PopulateDropOffLocationsDAO;
import com.uc.dao.PopulatePickUpLocationsDAO;
import com.uc.entity.DropOffEntity;
import com.uc.entity.PickUpEntity;

@Service
public class PopulateLocationService {
	
	@Autowired
	PopulatePickUpLocationsDAO ldao;
	@Autowired
	PopulateDropOffLocationsDAO ddao;
	
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
	
	public List<DropOffBean> populateDropOffLocations(){
		List<DropOffBean> beanList = new ArrayList<DropOffBean>();
		List<DropOffEntity> entityList = new ArrayList<DropOffEntity>();
		DropOffBean bean = new DropOffBean();
		System.out.println("Service works");
		entityList = ddao.findAll();
		for(DropOffEntity entity: entityList) {
			BeanUtils.copyProperties(entity, bean);
			beanList.add(bean);
			System.out.println("DAO works");
		}
		return beanList;
	}

}
