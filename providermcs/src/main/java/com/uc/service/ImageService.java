package com.uc.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.uc.businessbean.TrailBean;
import com.uc.dao.ImageDAO;
import com.uc.entity.ImageEntity;
@Service
public class ImageService {
	@Autowired
	ImageDAO idao;
	public String saveImage(TrailBean bean) {
		ImageEntity entity = new ImageEntity();
		BeanUtils.copyProperties(bean, entity);
		System.out.println(entity.getImageId());
		idao.save(entity);
		return "Image Saved";
		
	}
}
