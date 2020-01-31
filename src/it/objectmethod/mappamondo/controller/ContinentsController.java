package it.objectmethod.mappamondo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import it.objectmethod.mappamondo.dao.ICountryDao;
import it.objectmethod.mappamondo.dao.impl.CountryDao;

@Controller
public class ContinentsController {

	@RequestMapping("/continents")
	public String getContinents(Model model) {
		List<String> listContinent;
		
		ICountryDao continentDao = new CountryDao();
		
		listContinent = continentDao.getContinent();
		model.addAttribute("listaContinenti", listContinent);
		return "continentsView";
	}
	
	
}
