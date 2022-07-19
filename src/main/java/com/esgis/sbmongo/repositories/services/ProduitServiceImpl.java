/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.sbmongo.repositories.services;

import com.esgis.sbmongo.Models.Produit;
import com.esgis.sbmongo.repositories.ProduitRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class ProduitServiceImpl implements ProduitService {

     @Autowired
    private ProduitRepository produitRepo;
    @Override
    public Produit saveProduit(Produit p) {
        return produitRepo.save(p);    
    }

    @Override
    public Optional<Produit> findById(String id) {
        return produitRepo.findById(id);    
    }

    @Override
    public List<Produit> findAll() {
        return produitRepo.findAll();  
    }

    @Override
    public void deleteProduit(String id) {
        Optional<Produit> data= findById(id);
        if(data.isPresent()){
            produitRepo.deleteById(id);
        }    
    }
    
}
