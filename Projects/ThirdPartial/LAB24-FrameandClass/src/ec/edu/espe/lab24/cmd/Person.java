/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab24.cmd;

import ec.edu.espe.lab24.utils.*;

/**
 *
 * @author Fernanda Galárraga
 */
public class Person {
    private String surname;
    private float salary;
    private int hour;
    private float totalSalary;
    private float secure;
    private float liquidation;
    
    public String convertsToString(Person person)
    {
        String text;
        text=person.getSurname()+";"+person.getSalary()+";"+person.getHour()+";";
        
        return text;
 
    }


      public void addPersonToFile(Person person)
   {
       FilePrj file=new FilePrj();
       String text;
       String fileName="Person.csv";
       file.exists(fileName);
       text= this.convertsToString(person);
       file.save(fileName,text);
   } 
      public void calculateSalary(Person person)
   {
       FilePrj file=new FilePrj();
       String text;
       String fileName="Salary.csv";
       file.exists(fileName);
       text= this.convertsToString(person);
       file.save(fileName,text);
   } 
    
    public void totalSalary(){
        
        this.totalSalary= this.totalSalary*this.hour;
        this.secure= (float) (this.totalSalary*0.0945);
        this.liquidation = this.totalSalary-this.secure;
    }
   
    
     public boolean setSurname(String surnamel) {
        if(surnamel.matches("[a-zA-Z][a-zA-Z ]*"))  
        {
            this.surname = surnamel;
            return true;
        }
        else
        {
              System.out.println("ERROR: un nombre no puede tener numeros");  
              return false;
        }

    }
    public String getSurname() {
        return surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public float getSecure() {
        return secure;
    }

    public float getLiquidation() {
        return liquidation;
    }
    
 
}
