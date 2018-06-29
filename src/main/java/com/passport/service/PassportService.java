package com.passport.service;

import java.util.List;

import com.soap.web.model.Passport;

public interface PassportService {

	public String addPassport(Passport passport);

	public List<Passport> findPassports();

	public Passport findPassportByNumber(String pnumber);

	public String deletePassportByNumber(String pnumber);

}
