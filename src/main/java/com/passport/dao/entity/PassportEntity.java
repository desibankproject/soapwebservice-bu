package com.passport.dao.entity;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author nagendra
 *
 */

@Document(collection = "passports")
public class PassportEntity {
	
	 @Id
	private String id;
	private String number;
	private String firstName;
	private String lastName;
	private String middleName;
	private byte[] photo;
	private String marritalStatus;
	private String address;
	private String country;
	private String expiryDate;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getMarritalStatus() {
		return marritalStatus;
	}

	public void setMarritalStatus(String marritalStatus) {
		this.marritalStatus = marritalStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "PassportEntity [id=" + id + ", number=" + number + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", photo=" + Arrays.toString(photo) + ", marritalStatus="
				+ marritalStatus + ", address=" + address + ", country=" + country + ", expiryDate=" + expiryDate + "]";
	}



}
