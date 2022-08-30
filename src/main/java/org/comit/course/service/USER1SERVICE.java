package org.comit.course.service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import org.comit.course.controller.USER1;
import org.comit.course.dao.USER1DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class USER1SERVICE {

@Autowired
USER1DAO USER1DAO;	
 public BigDecimal doLogic(BigDecimal num1,
                    BigDecimal num2,
                    String operation) {
	 
	 BigDecimal result = BigDecimal.ZERO;

		switch(operation) {
		case "+":
			result = num1.add(num2);
			break;
		case "-":
			result = num1.subtract(num2);
			break;
		case "*":
			result = num1.multiply(num2);
			break;
		case "/":
			result = num1.divide(num2,MathContext.DECIMAL128);
			break;
		case "%":
			result = num1.remainder(num2);
			break;
		default:
			throw new RuntimeException("Invalid Operation!");
		} 
		
		List<USER1> users= USER1DAO.getdata();
				
		return result;
 }
}
