package com.passport.dao;

import java.util.List;

import com.passport.dao.entity.PassportEntity;

public interface PassportDao {

	public String addPassport(PassportEntity entity);

	public List<PassportEntity> findPassports();

	public PassportEntity findPassportByNumber(String pnumber);

	public String deletePassportByNumber(String pnumber);

}
