/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5;
        
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author amaaradji
 */
public class TestLectureFichier {
    public static void main(String[] args) {

        Scanner sc;
        try {
            File monfichier = new File("essai.txt");
            sc = new Scanner(monfichier);
            //int entierTest = sc.nextInt(); //lecture directe qui peut déclencher NoSuchElementException si fichier vide
            while (sc.hasNextInt()) {
                //String line = sc.nextLine();
                //int entier = Integer.parseInt(line);
                int entier = sc.nextInt();
                System.out.println(entier);
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("erreur de type à la lecture");
        } catch (NoSuchElementException e){
            System.out.println("fichier vide");
        }

    }
    
}
