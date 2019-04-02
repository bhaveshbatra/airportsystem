package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.entity.Admin;
import com.cognizant.service.AdminLoginService;
@Component("AdminValidator")
public class AdminValidator implements Validator{

	@Autowired
	private AdminLoginService adminService;
	
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0.equals(Admin.class);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		Admin admin=(Admin)arg0;
		//boolean adminAuth=adminService.doLogin(admin);
		//System.out.println(adminAuth);
		//if(!adminAuth){
			arg1.rejectValue("Email", "com.cognizant.entity.Admin.Email.invalid");
		}
		
	}
//}
