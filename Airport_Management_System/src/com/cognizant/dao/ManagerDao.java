package com.cognizant.dao;

import java.util.List;

import com.cognizant.entity.Manager;
import com.cognizant.model.ManagerModel;

public interface ManagerDao {

	public void managerRegister(Manager manager);
	

	public Manager managerCredentials(String manager_id, String manager_password);


	public List<Manager> getManagerDetails(String email);
	
}
