package com.passport.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.passport.dao.PassportDao;
import com.passport.dao.entity.PassportEntity;
import com.passport.service.PassportService;
import com.soap.web.model.Passport;

@Service("PassportServiceImpl")
public class PassportServiceImpl implements PassportService {
	
	@Autowired
	@Qualifier("PassportDaoImpl")
	private PassportDao passportDao;
	
	@Override
	public String addPassport(Passport passport){
		  System.out.println("Really it's working");
		  System.out.println(passport);
		  PassportEntity entity=new PassportEntity();
		  BeanUtils.copyProperties(passport, entity);
		  passportDao.addPassport(entity);
		  return "passport is added";
	}
	
	@Override
	public List<Passport> findPassports(){
		 List<PassportEntity> passportEntityList=passportDao.findPassports();
		 List<Passport> list=new ArrayList<Passport>();
		 for(PassportEntity entity:passportEntityList) {
			 Passport passport=new Passport();
			 BeanUtils.copyProperties(entity, passport);
			 list.add(passport);
		 }
		 return list;
	}
	
	@Override
	public Passport findPassportByNumber(String pnumber){
		  return null;
	}
	
	@Override
	public String deletePassportByNumber(String pnumber){
		  return null;
	}


}
