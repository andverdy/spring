package it.objectmethod.mappamondo.dao;

import java.util.List;

import it.objectmethod.mappamondo.model.Country;

public interface ICountryDao {

	
	public List<Country> getCountry(String nameCont);
	
	public List<String> getContinent();
	
}
