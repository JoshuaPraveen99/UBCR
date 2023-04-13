package com.uc.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uc.entity.TaxiEntity;

@Repository
@Transactional
public interface Taxidao extends JpaRepository<TaxiEntity, Integer>{
	@Modifying
	@Query("UPDATE TaxiEntity t SET t.currentSpot = :currentSpot, t.freeTime = :freeTime ,t.totalEarnings= :totalEarnings WHERE t.id = :taxiId")
	void updateUser(@Param("currentSpot") String currentSpot, @Param("freeTime") double freeTime, @Param("totalEarnings") int totalEarnings, @Param("taxiId") int taxiId);

}
