package com.cognizant.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Admin;
import com.cognizant.entity.Manager;
@Repository("AdminDAOImpl")
public class AdminLoginDAOImpl implements AdminLoginDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean doLogin(Admin admin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=
				session.createQuery("select o from Admin o where o.Email=:email and o.password=:password");
		query.setParameter("email", admin.getEmail());
		query.setParameter("password", admin.getPassword());
		List<Admin> adminList=query.list();
		
		if(adminList.isEmpty())
			return false;
		else
		return true;
	}
	@Override
	public boolean addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(admin);
		tx.commit();
		session.close();
		return true;
	}
	@Override
	public Admin addUser(String id, String password) {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.openSession();

		Admin admin = (Admin) session.get(Admin.class, id);
		
		
		return admin;
	}
	@Override
	public List<Admin> getAdminDetails(String ID) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=
				session.createQuery("from Admin");
		
		
		List<Admin> adminList=query.list();
		if(adminList.isEmpty())
			System.out.println("List Passed"+adminList.toString());
		else
			System.out.println("Not empty  "+adminList.get(0));
		
		return adminList;
	}
	@Override
	public List<Manager> getManagerDetails(String email) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Manager");
		List<Manager> managerList=query.list();
		return managerList;
				
		
	}

}
