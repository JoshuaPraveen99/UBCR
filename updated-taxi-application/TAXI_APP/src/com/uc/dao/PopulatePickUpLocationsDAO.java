package com.uc.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.entity.PickUpEntity;
@Repository
@Transactional
public interface PopulatePickUpLocationsDAO extends JpaRepository<PickUpEntity,Integer> {
	
	

}
