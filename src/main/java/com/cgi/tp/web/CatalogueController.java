package com.cgi.tp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cgi.tp.metier.ICatalogueMetier;

@Controller
public class CatalogueController {
	
	@Autowired
	private ICatalogueMetier metier;
	
	@RequestMapping(value="index")
	public String index() {	
		return "produits";
		
	}

}
