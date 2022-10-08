package com.ecommerce.microcommerce.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microcommerce.dao.ProduitDao;
import com.ecommerce.microcommerce.dao.ProduitDaoImp;
import com.ecommerce.microcommerce.model.Produit;

@RestController
public class ProductController {
	
	@Autowired
	private ProduitDaoImp produitDao;

	@GetMapping
	public String home() {
		return "Welcome Home Dear !";
	}
	
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public List<Produit> listeProduits() {
		return produitDao.findAll();
	}
	
	@GetMapping(value="/produits/{id}")
	public Produit afficherUnProduit(@PathVariable int id) {
		return produitDao.findById(id);
	}
	
}
