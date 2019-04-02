package com.cognizant.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Admin;
import com.cognizant.entity.Manager;
import com.cognizant.model.ManagerModel;

@Repository("ManagerDaoImpl")
public class ManagerDaoImpl implements ManagerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void managerRegister(Manager manager){
		
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(manager);
		
		tx.commit();
		
	}


	@Override
	public Manager managerCredentials(String manager_id, String manager_password) {
		Session session = sessionFactory.openSession();
		Manager manager;
         manager=(Manager)session.get(Manager.class,manager_id);
       
		return manager;
	
	}


	@Override
	public List<Manager> getManagerDetails(String email) {
					
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=
				session.createQuery("from Manager");
		List<Manager> managerList=query.list();
		return managerList;
	}
}
