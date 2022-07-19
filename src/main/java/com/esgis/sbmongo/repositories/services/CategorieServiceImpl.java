/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.sbmongo.repositories.services;

import com.esgis.sbmongo.Models.Categorie;
import com.esgis.sbmongo.repositories.CategorieRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class CategorieServiceImpl implements CategorieService {
    
    @Autowired
    private CategorieRepository categorieRepo;
    
    @Override
    public Categorie saveCategorie(Categorie c) {
        return categorieRepo.save(c);
    }

    @Override
    public Optional<Categorie>  findById(String id) {
        return categorieRepo.findById(id);
    }

    @Override
    public List<Categorie> findAll() {
        return categorieRepo.findAll();
    }

    @Override
    public void deleteCategorie(String id) {
        Optional<Categorie> data= findById(id);
        if(data.isPresent()){
            categorieRepo.deleteById(id);
        }
        
    }
    
}
