/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import ec.edu.espe.lab9.model.Operation;
import ec.edu.espe.lab9.model.Person;
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
        
        
        Person person;
        person = new Person();
  
        person.calculateAge(person.getYear(), person.getMonth(), person.getDay(), 0, 0 ,0 , 0, 0, 0);
        
        System.out.println("OPERATIONS");
        int operand1;
        int operand2;
         System.out.println("Enter the first number");
        Scanner wc = new Scanner(System.in);
        operand1 = wc.nextInt();
                System.out.println("Enter the second number");
                Scanner sc = new Scanner(System.in);
                operand2 = sc.nextInt();
        
        int result;
        Operation operation= new Operation(0,0,0);
        result=operation.add(operand1, operand2);
        result=operation.substract(operand1, operand2);
        result=operation.mult(operand1, operand2);
        result=operation.div(operand1, operand2);
        
        
        
        
        
        
        
        
    }
    
}
