package com.soap.web.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.passport.service.PassportService;
import com.soap.web.model.Passport;

//JAX-WS
@WebService
@Service("PassportSoapEndpoint")
public class PassportSoapEndpoint {
	
	@Autowired
	@Qualifier("PassportServiceImpl")
	private PassportService passportService;
	
	public String uploadPassport(Passport passport) {
		passportService.addPassport(passport);
		System.out.println("passport = "+passport);
		return "success";
	}
	
	public Passport findPassportDetailByNumber(String pnumber) {
		Passport passport=new Passport();
		passport.setAddress("CA1202");
		passport.setCountry("India");
		passport.setExpiryDate("12-July-2019");
		passport.setFirstName("Nagendra");
		passport.setLastName("Kumar");
		passport.setMarritalStatus("Married");
		passport.setNumber("GA322312902");
		return passport;
	}
	
	
	
	public List<Passport> findPassports() {
		List<Passport>  passports=passportService.findPassports();
		return passports;
		
	}

}
