/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MegaSystem
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void TestYear(){
        Person person = new Person(27,03,1997,0,0,0);
        int birthDay=27;
        int birthMonth=03;
        int birthYear=1997;
        int ageDay=7;
        int ageMonth=8;
        int ageYear=21;
        person.calculateAge(birthDay, birthMonth, birthYear, 0, 0, 0);
        assertEquals(ageDay,person.getAgeDay());
        assertEquals(ageMonth, person.getAgeMonth());
        assertEquals(ageYear, person.getAgeYear());
        System.out.println("La edad calculada es correcta");
    }
    @Test
    public void CalculateAge(){
        Person person = new Person(23,12,1996,0,0,0);
        int birthDay=23;
        int birthMonth=12;
        int birthYear=1996;
        int ageDay=11;
        int ageMonth=11;
        int ageYear=23;
        person.calculateAge(birthDay, birthMonth, birthYear, 0, 0, 0);
        assertEquals(ageDay,person.getAgeDay());
        assertEquals(ageMonth, person.getAgeMonth());
        assertEquals(ageYear, person.getAgeYear());
        System.out.println("La edad calculada es correcta");
    }
    @Test
    public void WrongCalculate(){
        Person person = new Person(27,03,1997,0,0,0);
        int birthDay=-1;
        int birthMonth=13;
        int birthYear=0;
        int ageDay=5;
        int ageMonth=-1;
        int ageYear=2018;
        person.calculateAge(birthDay, birthMonth, birthYear, 0, 0, 0);
        assertEquals(ageDay,person.getAgeDay());
        assertEquals(ageMonth, person.getAgeMonth());
        assertEquals(ageYear, person.getAgeYear());
        System.out.println("La edad calculada es correcta");
    }
    @Test
    public void CalculateAge1(){
        Person person = new Person(27,03,1997,0,0,0);
        int birthDay=18;
        int birthMonth=03;
        int birthYear=1999;
        int ageDay=16;
        int ageMonth=8;
        int ageYear=19;
        person.calculateAge(birthDay, birthMonth, birthYear, 0, 0, 0);
        assertEquals(ageDay,person.getAgeDay());
        assertEquals(ageMonth, person.getAgeMonth());
        assertEquals(ageYear, person.getAgeYear());
        System.out.println("La edad calculada es correcta");
    }
    @Test
    public void WrongCalcultaeAge(){
        Person person = new Person(27,03,1997,0,0,0);
        int birthDay=12;
        int birthMonth=12;
        int birthYear=2030;
        int ageDay=-3;
        int ageMonth=0;
        int ageYear=-12;
        person.calculateAge(birthDay, birthMonth, birthYear, 0, 0, 0);
        assertEquals(ageDay,person.getAgeDay());
        assertEquals(ageMonth, person.getAgeMonth());
        assertEquals(ageYear, person.getAgeYear());
        System.out.println("La edad calculada es correcta");
    }
}
