/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab18.model;

/**
 *
 * @author Fernanda Galárraga
 */
public class Person {
    private int id;
    private String name;
    private float salary;

    public Person(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

     @Override
     public String toString(){
         String text;
         text= "ID: " + id + " Name: " + name + " Salary: " + salary;
        return text;
     }
}
