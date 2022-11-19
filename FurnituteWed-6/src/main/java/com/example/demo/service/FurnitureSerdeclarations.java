package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Furniture;

public interface FurnitureSerdeclarations {
	public List <Furniture> showAll();
	public Furniture fetchById(int id);
	public void insorup(Furniture furniture);
	public void delete(int id);

	//public Optional < Furniture > findById(Integer id);
	//public List <Furniture> findAllFurniture(String keyword);
	public List<Furniture> findFurnitureByName(String name);
	

}
