package com.uc.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.uc.entity.LoginEntity;

public interface LoginDao extends JpaRepository<LoginEntity, String>{

	LoginEntity findByuserName(String username);

}
