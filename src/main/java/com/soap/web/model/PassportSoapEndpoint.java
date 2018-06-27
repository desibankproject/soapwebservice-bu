package com.soap.web.model;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

//JAX-WS
@WebService
public class PassportSoapEndpoint {
	
	public String uploadPassport(Passport passport) {
		return null;
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
