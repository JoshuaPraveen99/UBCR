package com.uc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.entity.ImageEntity;

@Repository
public interface ImageDAO extends JpaRepository<ImageEntity, Integer>{
	

}
