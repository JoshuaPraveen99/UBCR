package com.uc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.entity.RegEntity;

public interface RegDAO extends JpaRepository<RegEntity,Integer> {
	
	@SuppressWarnings("unchecked")
	public RegEntity save(RegEntity rEntity);

}
