package org.comit.course.controller;
import java.math.BigDecimal;
import org.comit.course.service.USER1SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController1 {
	@Autowired
	USER1SERVICE USER1SERVICE;

		@GetMapping( {"/","/calculate"} )
		public String init() {
			System.out.println("Init Calculator");

			return "calculator";
		}
		@PostMapping("/calculate")
		public ModelAndView show() {

			System.out.println();
		
	      
			return new ModelAndView();
		}

	}
