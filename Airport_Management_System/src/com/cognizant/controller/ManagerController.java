package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.Manager;
import com.cognizant.model.ManagerModel;
import com.cognizant.service.ManagerService;


@Controller
public class ManagerController {

	@Autowired //@Qualifier("AddManagerDetailsServiceImpl")
	ManagerService managerService;
	
	@RequestMapping("manager.htm")
	public String display(){
		return "index";
	}
	
	@RequestMapping("managerRegistration.htm")
	public ModelAndView viewRegistrationPage(@ModelAttribute("model") ManagerModel model){
		ModelAndView mv = new ModelAndView();	
		managerService.managerRegister(model);
		return mv.addObject("status","Your id is"+ model.getManager_id());
	}
	
	@RequestMapping("managerView.htm")
	public ModelAndView viewManager(@ModelAttribute("model") ManagerModel model){
		ModelAndView mv = new ModelAndView();
		if(managerService.checkCredentilas(model.getManager_id(),model.getManager_password()))
			{
			mv.addObject("status","Login Successful");
			mv.setViewName("managerView");
			}
		else
		{
		mv.setViewName("index");
		}
		return mv; 
	}
	
	
	
	@RequestMapping("managerReg.htm")
	public String viewManagerReg(){
		return "managerRegistration";
	}

	@ModelAttribute("model")
	public ManagerModel managerObject(){
		ManagerModel  model = new ManagerModel();
		return model;
	}
	
}
