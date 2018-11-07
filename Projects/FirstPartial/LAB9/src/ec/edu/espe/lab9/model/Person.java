/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.model;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author Josselyne Gutierrez / Maria Fernanda Galarraga
 */
public class Person {
    //BirthDay
    private int bDay;
    private int bMonth;
    private int bYear;
    //Date
    private int day;
    private int month;
    private int year;
    //AGE
    private int aDay;
    private int aMonth;
    private int aYear;
    
    
   

    
    public void calculateAge (int year, int month, int day, int bDay, int bMonth, int bYear, int aYear, int aMonth, int aDay)
    {
        System.out.println("Enter the year of your birth");
        Scanner a = new Scanner(System.in);
        bYear = a.nextInt();
        System.out.println("Enter the month of your birth");
        Scanner ac = new Scanner(System.in);
        bMonth = ac.nextInt();
        
        System.out.println("Enter the day of your birth");
        Scanner bc = new Scanner(System.in);
        bDay = bc.nextInt();
       
        Calendar date1 = new GregorianCalendar();
        year = date1.get(Calendar.YEAR);
        month = date1.get(Calendar.MONTH);
        day = date1.get(Calendar.DAY_OF_MONTH);
        System.out.println( day +"month:"+ month + "day"+ year);
        
        
        aYear=year-bYear;
        aMonth=month-bMonth;
        aDay=day-bDay;
        
        System.out.println("Your age is: \n" + aYear);
        
    }

    /**
     * @return the bDay
     */
    public int getbDay() {
        return bDay;
    }

    /**
     * @param bDay the bDay to set
     */
    public void setbDay(int bDay) {
        this.bDay = bDay;
    }

    /**
     * @return the bMonth
     */
    public int getbMonth() {
        return bMonth;
    }

    /**
     * @param bMonth the bMonth to set
     */
    public void setbMonth(int bMonth) {
        this.bMonth = bMonth;
    }

    /**
     * @return the bYear
     */
    public int getbYear() {
        return bYear;
    }

    /**
     * @param bYear the bYear to set
     */
    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the aDay
     */
    public int getaDay() {
        return aDay;
    }

    /**
     * @param aDay the aDay to set
     */
    public void setaDay(int aDay) {
        this.aDay = aDay;
    }

    /**
     * @return the aMonth
     */
    public int getaMonth() {
        return aMonth;
    }

    /**
     * @param aMonth the aMonth to set
     */
    public void setaMonth(int aMonth) {
        this.aMonth = aMonth;
    }

    /**
     * @return the aYear
     */
    public int getaYear() {
        return aYear;
    }

    /**
     * @param aYear the aYear to set
     */
    public void setaYear(int aYear) {
        this.aYear = aYear;
    }

    
}
