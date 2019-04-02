package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.ManagerDao;
import com.cognizant.entity.Manager;
import com.cognizant.model.ManagerModel;

@Service("ManagerServiceImpl")
public class ManagerServiceImpl  implements ManagerService {
	@Autowired
	ManagerDao managerDao;
	private boolean flag;
	@Override
	public void managerRegister(ManagerModel model){
		 Manager manager = new Manager();
		 
		 manager.setManager_id(model.getManager_id());
		 manager.setManager_first_name(model.getManager_first_name());
		 manager.setManager_last_name(model.getManager_last_name());
		 manager.setManager_age(model.getManager_age());
		 manager.setManager_gender(model.getManager_gender());
		 manager.setManager_contact_no(model.getManager_contact_no());
		 manager.setManager_alt_contact_no(model.getManager_alt_contact_no());
		 manager.setManager_dob(model.getManager_dob());
		 manager.setManager_email_id(model.getManager_email_id());
		 manager.setManager_password(model.getManager_password());
		 
		 managerDao.managerRegister(manager);
	}
	
	

	@Override
	public boolean checkCredentilas(String manager_id, String manager_password) {
		Manager manager = managerDao.managerCredentials(manager_id,manager_password);
		if(manager != null && manager.getManager_id().equals(manager_id) && manager.getManager_password().equals(manager_password))
			return true;
		
		return false;
	}
	
}
