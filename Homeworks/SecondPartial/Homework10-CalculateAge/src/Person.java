/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import ec.edu.espe.lab9.model.Operation;
/**
 *
 * @author Fernanda Galárraga
 */
public class Person {
 //   String name;
    int birthDay;
    int birthMonth;
    int birthYear;
    
    int year;
    int day;
    int month;

    int a,b;
    
    public void calculateAge(int birthDay,int birthMonth,int birthYear, int day, int month, int year){
    Date date=new Date();
    Operation operation = new Operation();
    int yearActual=date.getYear()+1900;
    int dayActual=date.getDay();
    int monthActual=date.getMonth()+1;
    
    year=operation.substract(yearActual, birthYear);
    month=operation.substract(monthActual, birthMonth);
    day=operation.substract(dayActual, birthDay);
    
    if(day<=0){
        day=30+day;
        month--;
    }
    if(month<=0){
        month=12+month;
        year--;
    }
    if(month>=12){
        month=0;
        year++;
    }
    if((year % 4 ==0 ) && ((year % 100 !=0)||(year %400==0))){
        System.out.println("El año es bisiesto");
    }else{
        System.out.println("El año no es bisiesto");
    }
        System.out.println("Your are " +year+" years, "+month+" months and "+day+" days");  
    }

    public Person( int birthDay, int birthMonth, int birthYear, int year, int day, int month) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.year = year;
        this.day = day;
        this.month = month;
    }
    
    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
}
