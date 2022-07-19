/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.sbmongo.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author pc
 */
@Document("produit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit{
    @Id
    private String id;
    private String nom;
    private int prix;
    private int quantite;
    private String description;
	

}
