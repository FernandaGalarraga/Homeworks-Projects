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
 * @author Jazz Gutierrez/Fernanda Galárraga
 */
public class Animal {
    protected int id;   
    protected int yearsOfStay;
    protected int arrivalYear;
    protected String scientificName;
    
    public Animal(){
        
    }

    public Animal(int id, int arrivalYear, String scientificName) {
        this.id = id;
        this.arrivalYear = arrivalYear;
        this.scientificName = scientificName;
        //this.yearsOfStay = computeYearsOfStay(arrivalYear);
    }
    
    public int computeYearsOfStay(int arrivalYear){
      int year;
      Calendar date1 = new GregorianCalendar();
      year = date1.get(Calendar.YEAR);
      yearsOfStay = year - arrivalYear;
        return yearsOfStay;
    }

    /**
     * @return the id
     */
     public int getYearsOfStay() {
        return yearsOfStay;
    }
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the arrivalYear
     */
    public int getArrivalYear() {
        return arrivalYear;
    }

    /**
     * @param arrivalYear the arrivalYear to set
     */
    public void setArrivalYear(int arrivalYear) {
        this.arrivalYear = arrivalYear;
    }

    /**
     * @return the scientificName
     */
    public String getScientificName() {
        return scientificName;
    }

    /**
     * @param scientificName the scientificName to set
     */
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }
   
    
}
