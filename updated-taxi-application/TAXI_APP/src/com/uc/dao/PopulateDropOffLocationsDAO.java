package com.uc.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.entity.DropOffEntity;
@Repository
@Transactional
public interface PopulateDropOffLocationsDAO extends JpaRepository<DropOffEntity, Integer>{
	

}
