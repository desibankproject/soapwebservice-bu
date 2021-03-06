package com.soap.web.service;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.soap.web.model.ErrorMessage;
import com.soap.web.model.NumNotValidException;

@WebService
@Service("FactorialEndpoint")
public class FactorialEndpoint {
	public int calFact(int num) throws NumNotValidException {
			if(num<0){
				ErrorMessage errorMessage=new ErrorMessage();
				errorMessage.setCode(707);
				errorMessage.setMessage("Hey number cannot be negative to compute factorial....");
				errorMessage.setDescription("This is mathmatics problem.");
				NumNotValidException exception=new NumNotValidException("There is some problem in computing factorial of a number", errorMessage);
				throw exception;
			}
			int sum=1;
			for(int x=2;x<=num;x++){
				  sum=sum*x;
			}
			return sum;
	}
}
