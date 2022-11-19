package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Furniture;

import com.example.demo.persistance.FurnitureJPAInterfaceRepository;
@Service
public class FurnitureSerImplementtations implements FurnitureSerdeclarations {
	private FurnitureJPAInterfaceRepository em;
    @Autowired
	public FurnitureSerImplementtations(FurnitureJPAInterfaceRepository em) {
	
		this.em = em;
	}
	
    @Override
    @Transactional
        public List<Furniture> showAll() {
    	return em.findAll();
    }

    @Override
    @Transactional
         public Furniture fetchById(int id) {
    	Furniture mp=em.findById(id).get();
       return mp;
    }

    @Override
    @Transactional
    public void insorup(Furniture furniture) {
    	em.save(furniture);
    }

    @Override
    @Transactional
    public void delete(int id) {
    em.deleteById(id);
    }

	

}
