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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amaaradji
 */
public class TestSerilisation {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
//        try { // serialisation binaire
//            fos = new FileOutputStream("t.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeInt(10325);
//            oos.writeObject("Today"); // conversion en String
//            oos.writeObject(new Date());
//            oos.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                fos.close();
//            } catch (IOException ex) {
//                Logger.getLogger(TestSerilisation.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        
        try { //desérialisation binaire
            fis = new FileInputStream("t.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int i = ois.readInt();
            String today = (String) ois.readObject();
            Date date = (Date) ois.readObject();
            System.out.println("lecture des objects " + i + " " + today + " " + date);
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
