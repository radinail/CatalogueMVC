package com.cgi.tp.metier;

import java.util.List;

import com.cgi.tp.dao.ICatalogueDao;
import com.cgi.tp.model.Produit;

public class ICatalogueMetierImpl implements ICatalogueMetier {
	
	private ICatalogueDao catalogueDao;
	
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		catalogueDao.addProduit(p);
		
	}

	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return catalogueDao.getAllProduits();
	}

	public List<Produit> getProduitParMC(String mc) {
		// TODO Auto-generated method stub
		return catalogueDao.getProduitParMC(mc);
	}

	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return catalogueDao.getProduit(ref);
	}

	public void deleteProduit(String ref) {
		// TODO Auto-generated method stub
		catalogueDao.deleteProduit(ref);
		
	}

	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		catalogueDao.updateProduit(p);
		
	}

	public void setCatalogueDao(ICatalogueDao catalogueDao) {
		this.catalogueDao = catalogueDao;
	}
	
	
}
