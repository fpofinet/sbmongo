/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.esgis.sbmongo.repositories;

import com.esgis.sbmongo.Models.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author pc
 */
public interface ProduitRepository extends MongoRepository<Produit, String>  {
    
}
