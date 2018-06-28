package com.passport.service.impl;

import org.springframework.stereotype.Service;

import com.passport.service.PassportService;
import com.soap.web.model.Passport;

@Service("PassportServiceImpl")
public class PassportServiceImpl implements PassportService {
	
	@Override
	public String addPassport(Passport passport){
		  System.out.println("Really it's working");
		  System.out.println(passport);
		  System.out.println(passport);
		  System.out.println(passport);
		  System.out.println(passport);
		  System.out.println(passport);
		  return "passport is added";
	}

}
