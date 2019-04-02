package com.cognizant.service;

import java.util.List;

import com.cognizant.entity.Admin;
import com.cognizant.entity.Manager;

public interface AdminLoginService {
	
	public boolean doLogin(Admin admin);
	boolean addAdmin(Admin admin);
	public boolean addUser(String id, String password);
	public List<Admin> getAdminDetails(String email);
	public List<Manager> getManagerDetails(String email);

}
