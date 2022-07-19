/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.esgis.sbmongo.repositories.services;

import com.esgis.sbmongo.Models.Categorie;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */

public interface CategorieService {
    public Categorie saveCategorie(Categorie c);
    public Optional<Categorie> findById(String id);
    public List<Categorie> findAll();
    public void deleteCategorie(String id);
}
