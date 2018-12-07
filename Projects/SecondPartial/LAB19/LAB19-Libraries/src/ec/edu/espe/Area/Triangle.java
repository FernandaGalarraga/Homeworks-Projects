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
public class Triangle extends Figure {
    private float height;
    private float base;

    @Override
    public float computeArea() {
        area=(base*height)/2;
        return getArea();
    }

    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }
}
