package com.passport.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.passport.dao.PassportDao;
import com.passport.dao.entity.PassportEntity;

@Service("PassportDaoImpl")
public class PassportDaoImpl implements PassportDao {
	
    @Autowired
    @Qualifier("mongoTemplate")
    private MongoTemplate mongoTemplate;
 
    final String COLLECTION = "passports";
	
	@Override
	public String addPassport(PassportEntity entity){
		 System.out.println("PassportDaoImpl addPassport method is called = "+entity);
		 mongoTemplate.insert(entity);
		  return "passport is added";
	}
	
	@Override
	public List<PassportEntity> findPassports(){
		 return (List < PassportEntity > ) mongoTemplate.findAll(PassportEntity.class);
	}
	
	@Override
	public PassportEntity findPassportByNumber(String pnumber){
		 Query query = new Query(Criteria.where("_id").is(pnumber));
	     return mongoTemplate.findOne(query, PassportEntity.class, COLLECTION);
	}
	
	@Override
	public String deletePassportByNumber(String pnumber){
		 Query query = new Query(Criteria.where("_id").is(pnumber));
		 PassportEntity passportEntity= mongoTemplate.findOne(query, PassportEntity.class, COLLECTION);
		 mongoTemplate.remove(passportEntity);
		 return "done";
	}


}
