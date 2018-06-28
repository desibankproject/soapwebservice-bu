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
		List<Passport> passports=new ArrayList<Passport>();
		Passport passport1=new Passport();
		passport1.setAddress("CA1202");
		passport1.setCountry("India");
		passport1.setExpiryDate("12-July-2019");
		passport1.setFirstName("Nagendra");
		passport1.setLastName("Kumar");
		passport1.setMarritalStatus("Married");
		passport1.setNumber("GA322312902");
		
		Passport passport2=new Passport();
		passport2.setAddress("CA3402");
		passport2.setCountry("India");
		passport2.setExpiryDate("12-June-2030");
		passport2.setFirstName("Benjamin");
		passport2.setLastName("Trd");
		passport2.setMarritalStatus("Single");
		passport2.setNumber("GP39393");
		
		passports.add(passport1);
		passports.add(passport2);
		
		return passports;
		
	}

}
