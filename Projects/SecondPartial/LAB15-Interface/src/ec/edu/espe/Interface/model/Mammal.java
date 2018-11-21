/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Interface.model;

import ec.edu.espe.Zoo.model.Animal;

/**
 *
 * @author Fernanda Galarraga
 */
public class Mammal implements Animal{

    @Override
    public void feed() {
        System.out.println("Feeding a mammal with milk and meat");
    }

    @Override
    public void asignHabitat() {
        System.out.println("A cell was assigned to the mammal");
    }
    
}
