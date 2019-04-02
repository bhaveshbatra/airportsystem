package com.cognizant.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.Admin;
import com.cognizant.entity.Manager;
import com.cognizant.service.AdminLoginService;


@Controller
public class AdminController {
	@Autowired
	private AdminLoginService adminLoginService;
	
	@Autowired@Qualifier("AdminValidator")
	private Validator adminvalidator;

	
	@RequestMapping(value ="index.htm")
	public String viewHome(){
		
		return "home";
	}
	
	@RequestMapping(value="register.htm")
	public String viewRegisterAdmin(){
		return "Registration";
	}
	
	@RequestMapping(value ="registrationadmin.htm", method = RequestMethod.POST)
	public ModelAndView getRegistrationValue(@ModelAttribute("admin")Admin admin){
		ModelAndView mv = new ModelAndView();
		boolean persistAdmin=adminLoginService.addAdmin(admin);
		if(persistAdmin)
		{
			mv.addObject("status","Admin Registered");
			mv.setViewName("home");
		}
		else{
			mv.addObject("status","Admin Registration Failed");
		mv.setViewName("Registration");
		}
		return mv;
	}
	
	@RequestMapping(value="login.htm")
	public String LoadLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="doLogin.htm",method=RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute("admin") Admin admin)
	{
		
		ModelAndView mv=new ModelAndView();
		boolean checkAdmin=adminLoginService.addUser(admin.getId(),admin.getPassword());
		if(checkAdmin)
		{
			List<Admin> adminList=adminLoginService.getAdminDetails(admin.getId());
			System.out.println("List Passed"+adminList);
			mv.addObject("adminList",adminList);
			mv.setViewName("welcome");
		}
		else
		{
			mv.addObject("status","Login Failed");
			mv.setViewName("notfound");
		}
		return mv;
	}
	
	@RequestMapping(value="viewdetails.htm",method=RequestMethod.POST)
	public ModelAndView viewdetails(@ModelAttribute("manager") Manager manager)
	{
		ModelAndView mv=new ModelAndView();
		List<Manager> managerList=adminLoginService.getManagerDetails(manager.getManager_id());
		mv.addObject("managerList",managerList);
		mv.setViewName("managerdetails");
		return mv;
	}
	
	@ModelAttribute("admin")
	public Admin createAdminObject(){
		Admin admin = new Admin();
		return admin;
	}
	
}