package com.uc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.entity.PickUpEntity;
@Repository
public interface PopulatePickUpLocationsDAO extends JpaRepository<PickUpEntity,Integer> {
	
	

}
