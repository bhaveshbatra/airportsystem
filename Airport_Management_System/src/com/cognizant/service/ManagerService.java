package com.cognizant.service;

import java.util.List;


import com.cognizant.entity.Manager;
import com.cognizant.model.ManagerModel;

public interface ManagerService {

	public void managerRegister(ManagerModel model);

	public boolean checkCredentilas(String manager_id, String manager_password);
	
	
	
}
