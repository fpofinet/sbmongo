/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.sbmongo.Controller;

import com.esgis.sbmongo.Models.Produit;
import com.esgis.sbmongo.repositories.services.ProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pc
 */
@RestController
@RequestMapping("/api/produits")
public class ProduitController {
    
    @Autowired
    private ProduitService categorieService;
    
    @PostMapping("/create")
    public ResponseEntity<Produit> createCateg(@RequestBody Produit p) {
        try {
            Produit prod = categorieService.saveProduit(p);
                    return  new ResponseEntity<>(prod, HttpStatus.CREATED);
        } catch (Exception e) {
            return  new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/get")
    public ResponseEntity<List<Produit>> getAll() {
        try {
            List<Produit> categories = categorieService.findAll();
            if(categories.isEmpty()){
                return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(categories, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/update")
    public ResponseEntity<Produit> updateProd(@RequestBody Produit p){
        try {
            Produit categ = categorieService.saveProduit(p);
            return new ResponseEntity<>(categ, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
