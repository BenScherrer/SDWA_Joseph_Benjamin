package com.mproduits.dao;

import com.mproduits.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Integer> {

    public Produit findById(int id);
    public List<Produit> findByDesignation(String s);

}
