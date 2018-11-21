/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Interface.model;

import ec.edu.espe.Zoo.model.Animal;

/**
 *
 * @author G403
 */
public class Reptile implements Animal {

    @Override
    public void feed() {
        System.out.println("Fed the reptile with rodents");
    }

    @Override
    public void asignHabitat() {
        System.out.println("A cell was assigned to the reptile");
    }
    
}
