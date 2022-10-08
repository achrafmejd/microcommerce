package com.ecommerce.microcommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.microcommerce.model.Produit;

@Repository
public class ProduitDaoImp implements ProduitDao{

	public static List<Produit> produits = new ArrayList<>();
	static {
		produits.add(new Produit(1, new String("Ball"), 100));
		produits.add(new Produit(2, new String("Baskets"), 40));
		produits.add(new Produit(3, new String("Wine"), 120));
	}
	
	@Override
	public List<Produit> findAll() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public Produit findById(int id) {
		for(Produit p : produits) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	@Override
	public Produit save(Produit produit) {
		produits.add(produit);
		return produit;
	}

}
