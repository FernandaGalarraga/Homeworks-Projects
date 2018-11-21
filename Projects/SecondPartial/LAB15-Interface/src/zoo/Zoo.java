/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import ec.edu.espe.Interface.model.Mammal;
import ec.edu.espe.Interface.model.Reptile;
import ec.edu.espe.Zoo.model.Animal;

/**
 *
 * @author Fernanda Galarraga
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal animal = new Mammal();
        System.out.println("The type of animal is: " + animal.getClass().getSimpleName());
       animal.feed();
       animal.asignHabitat();
       animal = new Reptile();
        System.out.println("The type of animal is: " + animal.getClass().getSimpleName());
        animal.feed();
        animal.asignHabitat();
    }
    
}
