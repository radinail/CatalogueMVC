package com.cgi.tp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cgi.tp.metier.ICatalogueMetier;
import com.cgi.tp.model.Produit;

@Controller
public class CatalogueController {
	
	@Autowired
	private ICatalogueMetier metier;
	
	@RequestMapping(value="index")
	public String index(Model model) {	
		//model.addAttribute("produit", new Produit());
		model.addAttribute("produits", metier.getAllProduits());
		return "produits";
		
	}
	
	@RequestMapping(value="saveProduit")
	public String saveProduit(Produit produit, Model model) {
		
		metier.addProduit(produit);
		//model.addAttribute("produit", new Produit());
		model.addAttribute("produits", metier.getAllProduits());
		return "produits";
		
	}

}
