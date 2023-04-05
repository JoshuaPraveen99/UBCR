package com.uc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.entity.DropOffEntity;

@Repository
public interface PopulateDropOffLocationsDAO extends JpaRepository<DropOffEntity, Integer>{
	

}
