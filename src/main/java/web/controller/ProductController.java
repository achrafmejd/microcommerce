package web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public String listeProduits() {
		return "Ceci est un produit";
	}
	
	@RequestMapping (value="/produits/{id}" , method=RequestMethod.GET)
	public String afficherUnProduit(@PathVariable int id) {
		return "Ceci est le produit avec id" + id;
	}
	
	
}
