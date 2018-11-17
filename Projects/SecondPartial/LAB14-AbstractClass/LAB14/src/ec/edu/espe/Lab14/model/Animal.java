/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab14.model;

/**
 *
 * @author Fernanda Galárraga
 */
public abstract class  Animal{
    private int id;
    private String scientificName;
    private int yearOfStay;
    private int arrivalYear;
    public abstract void giveBirth();
}
