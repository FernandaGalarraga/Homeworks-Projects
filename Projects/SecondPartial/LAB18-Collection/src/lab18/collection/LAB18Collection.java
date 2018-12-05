/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18.collection;

import ec.edu.espe.Lab18.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Fernanda Galarraga :v
 */
public class LAB18Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Collection things;
        things= new ArrayList();
        Person person = new Person(1, "Fernanda", 1000.5f);
        System.out.println("Size at the beginning: " + things.size());
        things.add(18000);
        things.add("Hello Quito");
        things.add(5000.25f);
        things.add(person);
        System.out.println("Size at the end: " + things.size());
        System.out.println("The elements of the list are" + things.toString());
        Object[] thingsArray = new Object[things.size()]; 
        thingsArray=things.toArray();
        System.out.println("The second element of the list is: " + thingsArray[2]);
        
        
        System.out.println("\nSize at the beginning: " + things.size());
        things.remove(thingsArray[2]);
        System.out.println("Size at the end: " + things.size());
        System.out.println("The elements of the list are: " + things.toString());
        
        System.out.println("\nSize at the beginning: " + things.size());
        things.add(3);
        things.add(3);
        things.add(3);
        System.out.println("Size at the end: " + things.size());
        System.out.println("The elements of the list are" + things.toString());
        things.remove(3);
        System.out.println("The elements of the list are: " + things.toString());
        
        System.out.println("\nSize at the beginning: " + things.size());
        things.add(5);
        things.add(8);
        things.add(4);
        things.add(8);
        things.add(9);
        things.add(8);
        System.out.println("Size at the end: " + things.size());
        things.remove(8);
        System.out.println("The elements of the list are: " + things.toString());
        
        
        System.out.println("\nSize at the beginning: " + things.size());
        things.remove(person);
        System.out.println("Size at the end: " + things.size());
        System.out.println("The elements of the list are: " + things.toString());
        
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        
        Collection<Person> persons;
        persons= new ArrayList<>();
        for(int i=0; i<=5; i++){
            persons.add(new Person(i, "Fernanda"+i, 1000f*i));
        }
        for (Person pi: persons){
            System.out.println("Person -->" + pi);
        }
    }
    
}
