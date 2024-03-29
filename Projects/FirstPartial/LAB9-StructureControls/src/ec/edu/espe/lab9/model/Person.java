/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.model;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Josselyne Gutierrez / Maria Fernanda Galarraga
 */
public class Person {
    //BirthDay
    private int birthDay;
    private int birthMonth;
    private int birthYear;
   
    //AGE
    private int ageDay;
    private int ageMonth;
    private int ageYear;

   

    
    public void calculateAge (int birthDay, int birthMonth, int birthYear, int ageDay, int ageMonth, int ageYear)
    {
        //Date
        int year;
        int month;
        int day;
       
        Calendar date1 = new GregorianCalendar();
        year = date1.get(Calendar.YEAR);
        month = date1.get(Calendar.MONTH)+1;
        day = date1.get(Calendar.DAY_OF_MONTH);
       
        ageDay=day-birthDay;
        ageMonth=month-birthMonth;
        ageYear=year-birthYear;
        //System.out.println("Your age is: \n" +ageYear +" years, " +ageMonth +" months" +ageDay +" days");
         
        if(ageDay<0)
        {
            ageDay=30+ageDay;
            ageMonth--;
        } 
        
        if(ageMonth<0)
        {
            ageMonth=12+ageMonth;
            ageYear--;
        }
        
        
        
        
        System.out.println("Your age is: \n" + "years :"+ageYear +" \nmonth :" +ageMonth +" \nday :" +ageDay);
        
    }

    public Person(int birthDay, int birthMonth, int birthYear, int ageDay, int ageMonth, int ageYear) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ageDay = ageDay;
        this.ageMonth = ageMonth;
        this.ageYear = ageYear;
    }

    /**
     * @return the birthDay
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the birthMonth
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * @param birthMonth the birthMonth to set
     */
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * @return the birthYear
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * @return the ageDay
     */
    public int getAgeDay() {
        return ageDay;
    }

    /**
     * @param ageDay the ageDay to set
     */
    public void setAgeDay(int ageDay) {
        this.ageDay = ageDay;
    }

    /**
     * @return the ageMonth
     */
    public int getAgeMonth() {
        return ageMonth;
    }

    /**
     * @param ageMonth the ageMonth to set
     */
    public void setAgeMonth(int ageMonth) {
        this.ageMonth = ageMonth;
    }

    /**
     * @return the ageYear
     */
    public int getAgeYear() {
        return ageYear;
    }

    /**
     * @param ageYear the ageYear to set
     */
    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }
    
}