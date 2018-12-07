/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19.consummingmylibrary;

import ec.edu.espe.Area.Figure;
import ec.edu.espe.Area.Triangle;
import ec.edu.espe.Operation.BasicOperation;
/**
 *
 * @author Fernanda Galarraga
 */
public class LAB19ConsummingMyLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figure figure = new Triangle(1,2);
        
        float localArea;
       localArea=figure.computeArea();
        System.out.println("El area de la figura es: " + figure.getArea());
        BasicOperation operation=new BasicOperation(1.2f,1.4f);
        float result=operation.add();
        System.out.println("\nLa suma es: " + result);
        result=operation.subtract();
        System.out.println("La resta es: " + result);
        result=operation.multiply();
        System.out.println("La multiplicacion es: " + result);
        result=operation.div();
        System.out.println("La division es: " + result);
        
        BasicOperation operation2=new BasicOperation(1.2f,2.4f);
        result=operation2.add();
        System.out.println("\nLa suma es: " + result);
        result=operation2.subtract();
        System.out.println("La resta es: " + result);
        result=operation2.multiply();
        System.out.println("La multiplicacion es: " + result);
        result=operation2.div();
        System.out.println("La division es: " + result);
    }
    
}
