package com.cgi.tp.dao;

import java.util.List;

import com.cgi.tp.model.Produit;

public interface ICatalogueDao {
	
	public void addProduit(Produit p);
	public List<Produit> getAllProduits();
	public List<Produit> getProduitParMC(String MC);
	public Produit getProduit(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);
	
}
