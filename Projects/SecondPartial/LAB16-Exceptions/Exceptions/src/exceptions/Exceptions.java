/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import ec.edu.espe.exceptions.model.Animal;
import ec.edu.espe.exceptions.operations.Operation;

/**
 *
 * @author Fernanda Galárraga
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operation operation= new Operation();
        float result;
        result=operation.divide(3, 5);
        System.out.println("The quotient is:" +result);
        
        result=operation.divide(386, 897);
        System.out.println("The quotient is:" +result);
        
        result=operation.divide(5.8f, 1.3f);
        System.out.println("The quotient is:" +result);
        
        result=operation.divide(8, 0);
        System.out.println("The quotient is:" +result);
        
        result=operation.add(1.2f, 2.9f);
        System.out.println("The quotient is:" +result);
        
        result=operation.add(1.2f, 2.4f);
        System.out.println("The quotient is:" +result);
        
        result=operation.add(1.2f, 2.9f);
        System.out.println("The quotient is:" +result);
        
        result=operation.add((short)1.2, (short)2.4);
        System.out.println("The quotient is:" +result);
        
        
        result=operation.add((short)30000, (short)400000);
        System.out.println("The quotient is:" +result);
        
        result=operation.add(30000f, 400000f);
        System.out.println("The quotient is:" +result);
        
        result=operation.add(1.2f, 2);
        System.out.println("The quotient is:" +result);
        
        
        Animal animal = null;
        System.out.println(animal.eyes);

    }
    
}
