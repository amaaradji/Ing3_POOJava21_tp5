/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5;

import java.io.Serializable;

/**
 *
 * @author amaaradji
 */
public class PileEntiers extends Pile implements Serializable{
    
    @Override
    public Integer Depiler() throws VideException {
        Integer i = (Integer)super.Depiler();
        return i;
    }
    
    void afficher(){
        maListe.afficher();
    }
}
