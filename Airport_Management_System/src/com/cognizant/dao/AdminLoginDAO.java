package com.cognizant.dao;

import java.util.List;

import com.cognizant.entity.Admin;
import com.cognizant.entity.Manager;

public interface AdminLoginDAO {
	
	public boolean doLogin(Admin admin);
	boolean addAdmin(Admin admin);
	public Admin addUser(String id, String password);
	public List<Admin> getAdminDetails(String email);
	public List<Manager> getManagerDetails(String email);

}
