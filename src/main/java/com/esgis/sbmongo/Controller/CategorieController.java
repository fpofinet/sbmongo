/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.sbmongo.Controller;

import com.esgis.sbmongo.Models.Categorie;
import com.esgis.sbmongo.repositories.services.CategorieService;
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
@RequestMapping("/api/categories")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;
    
    @PostMapping("/create")
    public ResponseEntity<Categorie> createCateg(@RequestBody Categorie c) {
        try {
            Categorie categ = categorieService.saveCategorie(c);
                    return  new ResponseEntity<>(categ, HttpStatus.CREATED);
        } catch (Exception e) {
            return  new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/get")
    public ResponseEntity<List<Categorie>> getAll() {
        try {
            List<Categorie> categories = categorieService.findAll();
            if(categories.isEmpty()){
                return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(categories, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/update")
    public ResponseEntity<Categorie> updateCateg(@RequestBody Categorie c){
        try {
            Categorie categ = categorieService.saveCategorie(c);
            return new ResponseEntity<>(categ, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody String id){
        try{
            categorieService.deleteCategorie(id);
            return new ResponseEntity<>("supprimer", HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
