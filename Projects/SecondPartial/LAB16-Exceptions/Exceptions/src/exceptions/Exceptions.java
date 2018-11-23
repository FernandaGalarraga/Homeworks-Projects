/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import ec.edu.espe.Animal.model.Animal;
import ec.edu.espe.Operations.model.Operation;
import java.io.IOException;

/**
 *
 * @author Fernanda Galárraga
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operation operation = new Operation();
        float quotient;
        quotient = operation.divide(3,5);
        System.out.println("The result is: " + quotient);
        quotient = operation.divide(386,897);
        System.out.println("The result is: " + quotient);
        quotient = operation.divide(5.8f,1.3f);
        System.out.println("The result is: " + quotient);
        quotient = operation.divide(8, 0);
        System.out.println("The result is: " + quotient);
        float result;
        result = operation.add(1.2f, 2.9f);
        System.out.println("The result is: " + result);
        short result1;
        result1 = operation.add((short) 1.2, (short) 2.4);
        System.out.println("The result is: " + result1);
        result1 = operation.add((short)40000,(short)30000);
        System.out.println("The result is: " + result1);
        result = operation.add(5,1.2f);
        System.out.println("The result is: " + result);
        Animal animal = null;
        //animal = new Animal();
        if(animal != null){
            System.out.println("The animal exist");
        }else{
            System.out.println("The animal doesn't exist");
        }
        try{
            System.out.println("The first line run");
           System.out.println(animal.eyes); 
        }
        catch(NullPointerException ex){
            System.out.println("An error occured" + ex);
            System.out.println("The program is still running");
            System.out.println("The exception is " + ex.getMessage());
            if(ex.toString().equals("java.lang.NullPointerException")){
                System.out.println("The are not animals");
                animal = new Animal();
                if(animal.eyes!=null){
                    System.out.println(animal.eyes);
                }else{
                    animal.eyes="brown";
                    System.out.println("The color of the eyes of the horse are: " + animal.eyes);
                }
                
            }
            //System.out.println("Stack trace" + ex.getStackTrace());
            //ex.printStackTrace();
      }
        finally{
            System.out.println("After the exception");
        }
        System.out.println("This is the bain number " + animal.bainNumber);
        Animal animal2 = new Animal();
        System.out.println("This is the bain number " + animal2.getBainNumber());
        animal.asignBainNumber(18);
        System.out.println("This is the bain number " + animal.bainNumber);
        animal2.getBainNumber();
        System.out.println("This is the bain number " + animal2.getBainNumber());
   }   
}
