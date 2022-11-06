package com.ecommerce.microcommerce.dao;

import java.util.List;

import com.ecommerce.microcommerce.model.Produit;

public interface ProduitDao {
	/**
	 * Get all products : done
	 * Get a product by Id : done
	 * Update Product : x
	 * Delete Product : x
	 * Add product : done
	 */
	public List<Produit> findAll();
	public Produit findById(int id);
	public Produit deleteById(int id);
	public Produit updateById(Produit produit);
	public Produit save(Produit produit);
}
