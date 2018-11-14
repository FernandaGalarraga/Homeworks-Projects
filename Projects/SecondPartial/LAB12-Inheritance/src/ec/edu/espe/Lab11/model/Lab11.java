/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab11.model;
import Lab11.*;
import ec.edu.espe.Lab11.model.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author Jazz Gutierrez/ Fernanda Galárraga
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Mammal[] mammal= new Mammal[3];
           Mammal mam= new Mammal();
                int yearstate;
       for (int i=0;i<mammal.length;i++){
            String texto=JOptionPane.showInputDialog("Enter number of nipples");
            int numberOfNipple = Integer.parseInt(texto);
            texto=JOptionPane.showInputDialog("Enter the id of the animal");
            int id = Integer.parseInt(texto);
            texto=JOptionPane.showInputDialog("Enter arrival year");
            int arrivalYear = Integer.parseInt(texto);
            String scientificName = JOptionPane.showInputDialog("Enter the name");
            mammal[i] = new Mammal(numberOfNipple,id,arrivalYear,scientificName);
            yearstate=mam.computeYearsOfStay(arrivalYear);
            mammal[i].yearsOfStay=yearstate;
         
       }
       for (int i=0;i<mammal.length;i++){
            System.out.println(mammal[i].getId()+" "+mammal[i].getScientificName()+"\nTime of stay: "+mammal[i].getYearsOfStay());
        }
    }
}
