/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.model;
import ec.edu.espe.lab9.model.Person;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author Fernanda Galarraga
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     Scanner fx = new Scanner(System.in);
        Date date=new Date();
        
        Person person;
        person = new Person (0,0,0,0,0,0);
        
        boolean op=false;
        
        do {            
            try {
                do {            
                    System.out.println("Anio de nacimiento: ");
                    Scanner yx = new Scanner(System.in);
                    person.setBirthYear(yx.nextInt());
                    op=true;
                } while (person.birthYear<1900 || person.birthYear>date.getYear()+1900);
            } catch (Exception e) {
                System.out.println("Valido solo para numeros");
                op=false;
            }
        } while (op==false);
        
        op=false;
          
        do {            
            try {
                do {            
                    System.out.println("Mes de nacimiento: ");
                    Scanner m = new Scanner(System.in);
                    person.setBirthMonth(m.nextInt());
                    op=true;
                } while (person.birthMonth<=0 || person.birthMonth>12);
            } catch (Exception e) {
                System.out.println("Valido solo para numeros");
                op=false;
            }
        } while (op==false);
        do {      
            try {
                do {            
                    System.out.println("Dia de nacimiento: ");
                    Scanner d = new Scanner(System.in);
                    person.setBirthDay(d.nextInt());
                    op=true;
                } while (person.birthDay<=0 || person.birthDay>30);
            } catch (Exception e) {
                System.out.println("Valido solo para numeros");
                op=false;
            }
        } while (op==false);
      
        person.calculateAge(person.getBirthDay(), person.getBirthMonth(), person.getBirthYear(), 0,0,0);
    }
}
    
