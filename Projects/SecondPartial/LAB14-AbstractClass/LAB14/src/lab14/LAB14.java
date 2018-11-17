/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;
import ec.edu.espe.Lab14.model.Animal;
import ec.edu.espe.Lab14.model.Mammal;
/**
 *
 * @author Fernanda Galarraga
 */
public class LAB14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal;
        animal = new Mammal();
        animal.giveBirth();
        System.out.println("animal is a type of -->" + animal.getClass().getSimpleName());
    }
    
}
