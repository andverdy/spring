package it.objectmethod.mappamondo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.objectmethod.mappamondo.dao.ICountryDao;
import it.objectmethod.mappamondo.dao.impl.CountryDao;

@Controller
public class CountryController {

	@RequestMapping(value = "/countries", method = RequestMethod.GET)
	public String getCountries(@PathVariable("nomeCont") String nomeCont, Model model, HttpServletRequest request) {
		List<String> listCountries;
		
		ICountryDao continentDao = new CountryDao();
		// SELECT DISTINCT Name FROM country WHERE Continent = 'Europe';
		return "countriesView";
	}
	
}
