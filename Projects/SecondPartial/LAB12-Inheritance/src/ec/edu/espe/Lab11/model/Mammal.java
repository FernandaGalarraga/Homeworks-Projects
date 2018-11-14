/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab11.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jazz Gutierrez/Fernanda Galarraga
 */
public class Mammal extends Animal{
    public Mammal(){
        
    }
     public int validation(int arrivalYear)
    {
        int year;
        if (arrivalYear<0)
        {
            System.out.println("The date isnt correct");
            return 1;
        }
        else
        {
            Calendar date1 = new GregorianCalendar();
            year = date1.get(Calendar.YEAR);
            if(arrivalYear>year)
            {
                System.out.println("The date isnt correct, Enter again");
                return 1;
            }
            
        }
        return 0;  
    }
    private int numberOfNipple;

    
    public boolean feedbabies(){
        System.out.println("Está alimentando");
        return true;
    }
    
    public boolean placentalReproduction(){
        
        return true;
    }
    /**
     * @return the numberOfNipple
     */
    public int getNumberOfNipple() {
        return numberOfNipple;
    }
    
    /**
     * @param numberOfNipple the numberOfNipple to set
     */
    public void setNumberOfNipple(int numberOfNipple) {
        this.numberOfNipple = numberOfNipple;
    }

    public Mammal(int numberOfNipple, int id, int arrivalYear, String scientificName) {
        super(id, arrivalYear, scientificName);
        this.numberOfNipple = numberOfNipple;
    }

    public int getYearsOfStay() {
        return yearsOfStay;
    }
}
