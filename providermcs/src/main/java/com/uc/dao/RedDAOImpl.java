package com.uc.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uc.entity.RegEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class RedDAOImpl implements RegDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public RegEntity RegisterNewProvider(RegEntity rEntity) {
		try {
			em.persist(rEntity);
		}
		catch (Exception e) {
			throw e;
		}
		return rEntity;
	}

}
