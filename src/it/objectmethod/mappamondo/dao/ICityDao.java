package it.objectmethod.mappamondo.dao;

import java.util.List;

import it.objectmethod.mappamondo.model.City;

public interface ICityDao {

	
	
	public List<City> getCities(String contryCode);
	
	
}
