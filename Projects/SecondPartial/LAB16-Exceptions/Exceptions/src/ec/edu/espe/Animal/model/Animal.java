/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Animal.model;

/**
 *
 * @author Fernanda Galárraga
 */
public class Animal {
    public String eyes;
    public static int bainNumber = 7;
    
    public void asignBainNumber(int bN){
        setBainNumber(bN);
    }
    public void feed(){
        System.out.println("The animal is eating");
    }

    /**
     * @return the bainNumber
     */
    public int getBainNumber() {
        return bainNumber;
    }

    /**
     * @param bainNumber the bainNumber to set
     */
    public void setBainNumber(int bainNumber) {
        this.bainNumber = bainNumber;
    }

}
