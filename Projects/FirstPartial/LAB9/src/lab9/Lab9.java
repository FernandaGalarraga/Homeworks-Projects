/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import ec.edu.espe.Operation;
import ec.edu.espe.Person;
import java.util.Scanner;

/**
 *
 * @author Josselyne Gutierrez / Maria Fernanda Galarraga
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Person person;
        person = new Person();
        Scanner sc = new Scanner(System.in);
        person.bYear= sc.nextInt();*/
        
        int result;
        Operation operation= new Operation(0,0,0);
        result=operation.add(0, 0);
        result=operation.substract(1, 1);
        System.out.println("El resultado es:" +result);
        result=operation.mult(1, 1);
        result=operation.div(1, 1);
        
        
        
        
        
        
        
        
    }
    
}
