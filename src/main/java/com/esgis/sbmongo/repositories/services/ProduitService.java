/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.esgis.sbmongo.repositories.services;

import com.esgis.sbmongo.Models.Produit;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author pc
 */
public interface ProduitService {
    public Produit saveProduit(Produit p);
    public Optional<Produit> findById(String id);
    public List<Produit> findAll();
    public void deleteProduit(String id);
}
