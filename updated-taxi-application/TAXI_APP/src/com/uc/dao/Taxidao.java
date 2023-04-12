package com.uc.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uc.entity.LoginEntity;
import com.uc.entity.TaxiEntity;

@Repository
@Transactional
public interface Taxidao extends JpaRepository<TaxiEntity, Integer>{

}
