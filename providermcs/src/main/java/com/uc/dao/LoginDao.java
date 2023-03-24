package com.uc.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.uc.entity.LoginEntity;

public interface LoginDao extends JpaRepository<LoginEntity, String>{

	LoginEntity findOne(String username);

}
