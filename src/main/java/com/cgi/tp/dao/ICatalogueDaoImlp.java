package com.cgi.tp.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cgi.tp.model.Produit;

public class ICatalogueDaoImlp implements ICatalogueDao{
	
	private Map<String, Produit> produits = new HashMap<String, Produit>();
	
	public void addProduit(Produit p) {
		produits.put(p.getReference(), p);		
	}
	
	public List<Produit> getAllProduits(){
		Collection<Produit> prods = produits.values();
		return (new ArrayList<Produit> (prods));
	}
	
	public List<Produit> getProduitParMC(String mc){
		
		List<Produit> prods = new ArrayList<Produit>();	
		
		for(Produit p : produits.values()) {
			if(p.getDesignation().indexOf(mc) >= 0)
				prods.add(p);				
		}
		
		return prods;
	}
	
	public Produit getProduit(String ref) {
		return produits.get(ref);
	}
	
	public void deleteProduit(String ref) {
		produits.remove(ref);
	}
	
	public void updateProduit(Produit p) {
		produits.put(p.getReference(), p);
	}
	
	public void init() {
		addProduit(new Produit("HP", "Ordi HP", 8000, 12));
		addProduit(new Produit("ASUS", "Ordi ASUS", 800, 1));
		addProduit(new Produit("MAC", "Ordi MAC", 80000, 120));
	}
}
