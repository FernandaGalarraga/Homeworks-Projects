/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Exception.model;

/**
 *
 * @author Fernanda Galárraga
 */
public class MyException extends Exception {
    public static final long id=700L;

    public MyException(String message) {
        super(message);
    }
    
    
}
