package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.AdminLoginDAO;
import com.cognizant.entity.Admin;
import com.cognizant.entity.Manager;

@Service("AdminLoginServiceImpl")
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminLoginDAO adminLoginDAO;
	
	@Override
	public boolean doLogin(Admin admin) {
		 //TODO Auto-generated method stub
		return adminLoginDAO.doLogin(admin);
	}

	@Override
	public boolean addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminLoginDAO.addAdmin(admin);
	}

	@Override
	public boolean addUser(String id, String password) {
		// TODO Auto-generated method stub
		System.out.println(id+" "+password);
		
		Admin admin =  adminLoginDAO.addUser(id,password);
		if(admin==null)
		{

			return false;
		}
		else if(admin.getId().equals(id) && admin.getPassword().equals(password))
		{
			

			return true;
		}
		return false;
	}

	@Override
	public List<Admin> getAdminDetails(String email) {
		// TODO Auto-generated method stub
		
		return adminLoginDAO.getAdminDetails(email);
	}

	@Override
	public List<Manager> getManagerDetails(String email) {
		// TODO Auto-generated method stub
		return adminLoginDAO.getManagerDetails(email);
	}
	

}