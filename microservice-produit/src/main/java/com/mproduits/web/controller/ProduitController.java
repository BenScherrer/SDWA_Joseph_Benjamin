package com.mproduits.web.controller;


import com.mproduits.dao.ProduitDao;
import com.mproduits.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;



@RestController
public class ProduitController {


    @Autowired
    ProduitDao produitDao;

    @GetMapping("/")
    public String coucou(){
        return "coucou";
    }

    // Affiche la liste de tous les produits disponibles
    @GetMapping(value = "/Produits")
    public List<Produit> listeDesProduits(){

        List<Produit> products = produitDao.findAll();



        return products;

    }

    //Récuperer un produit par son id
    @GetMapping( value = "/Produits/{id}")
    public Optional<Produit> recupererUnProduit(@PathVariable int id) {

        Optional<Produit> produit = Optional.ofNullable(produitDao.findById(id));



        return produit;
    }

}
