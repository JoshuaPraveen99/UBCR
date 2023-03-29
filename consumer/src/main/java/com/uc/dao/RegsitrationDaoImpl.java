package com.uc.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uc.entity.RegistrationEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class RegsitrationDaoImpl implements RegistrationDao{
	
	@PersistenceContext
	private EntityManager em;

    @Override
	public RegistrationEntity RegisterNewCustomer(RegistrationEntity rEntity) {
		try {
			em.persist(rEntity);
		}
		catch (Exception e) {
			throw e;
		}
		return rEntity;
	}

}
