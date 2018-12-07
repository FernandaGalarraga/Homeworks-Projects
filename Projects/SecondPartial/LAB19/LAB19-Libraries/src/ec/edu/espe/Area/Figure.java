/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Area;

/**
 *
 * @author Fernanda Galárraga
 */
public abstract class Figure {
    protected float area;
    
    public abstract float computeArea();

   
    public float getArea() {
        return area;
    }
    
}
