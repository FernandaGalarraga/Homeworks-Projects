/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import ec.edu.espe.lab9.model.Operation;
import ec.edu.espe.lab9.model.Person;
import ec.edu.espe.lab9.utils.FileManager;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Josselyne Gutierrez / Maria Fernanda Galarraga
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int option=0; String op="";
        op=JOptionPane.showInputDialog("Select an option: \n"
                + "1. AGE\n"
                + "2. OPERATION");
        option=Integer.parseInt(op);
        switch(option){
            case 1:  
                Person person;
                person = new Person( 0, 0, 0, 0, 0, 0);
                int validation;
                String personName;
                System.out.println("Enter your name");
                Scanner fc = new Scanner(System.in);
                personName= fc.next();
        do
        {
            System.out.println("Enter the year of your birth");
            Scanner a = new Scanner(System.in);
            person.setBirthYear(a.nextInt());
            System.out.println("Enter the month of your birth");
            Scanner ac = new Scanner(System.in);
            person.setBirthMonth(ac.nextInt());

            System.out.println("Enter the day of your birth");
            Scanner bc = new Scanner(System.in);
            person.setBirthDay(bc.nextInt());

            validation=person.validation(person.getBirthDay(), person.getBirthMonth(), person.getBirthYear());
        
        }while (validation==1);
        
        person.calculateAge(person.getBirthDay(), person.getBirthMonth(), person.getBirthYear(), 0, 0, 0);
        FileManager file =new FileManager("","");
        System.out.println("Enter the file name");
        Scanner cc = new Scanner(System.in);
        file.setName(cc.next());
        
        String text;
        text=personName+"-"+person.getAgeDay()+"-"+person.getAgeMonth()+"-"+person.getAgeYear()+"-"+person.getBirthDay()+"-"+person.getBirthMonth()+"-"+person.getBirthYear();
        file.save(file.getName(), text);
        break;
            case 2: 
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
        System.out.println("The result is: " + result);
        System.exit(0);
             default:JOptionPane.showMessageDialog(null, "Error Option End of program");
           
        } 

        
    }
    
}
