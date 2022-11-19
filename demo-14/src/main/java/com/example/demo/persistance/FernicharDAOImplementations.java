package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Furniture;
@Repository
public class FernicharDAOImplementations implements FernicharDAOdeclartions {
	
	private EntityManager entitymanager;
    
	
	@Autowired
	public FernicharDAOImplementations(EntityManager entitymanager) {
	
		this.entitymanager = entitymanager;
	}
	
	@Override
	public List<Furniture> displayAll() {
		//invoke with session
		Session session=entitymanager.unwrap(Session.class);
		//create query
		Query<Furniture> query=session.createQuery("from fr",Furniture.class);
		//execute query
		 List<Furniture> farnicher=query.getResultList();
		//returning the result	
		return farnicher;
	}

	@Override
	public Furniture getById(int id) {
		//invoke with session
		Session session=entitymanager.unwrap(Session.class);
		//calling method(creation and execution)
		Furniture emp=session.get(Furniture.class,id);
	    //returning result
	    return emp;
	   
	}

	@Override
	public void save(Furniture farnicher) {
		//invoke with session
		Session session=entitymanager.unwrap(Session.class);
		//calling method(creation and execution)
		session.saveOrUpdate(farnicher);
	}

	@Override
	public void deleteById(int id) {
		//invoke with session
		Session session=entitymanager.unwrap(Session.class);
		//create query
		Query query=session.createQuery("delete from fr where id=:frId");
		//set the parameter
		query.setParameter("frId",id);
		//execute query
		query.executeUpdate();
	}


	
	
}
