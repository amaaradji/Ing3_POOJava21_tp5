/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amaaradji
 */
public class TestSerialisationListe {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        try { // serialisation binaire
            fos = new FileOutputStream("t.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Liste maliste = new Liste();
            maliste.Ajouter(23);
            maliste.Ajouter(45);
            maliste.Ajouter(67);
            oos.writeObject(maliste);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try { //desérialisation binaire
            fis = new FileInputStream("t.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Liste maliste = (Liste) ois.readObject();
            
            System.out.println("lecture des objects "  );
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
