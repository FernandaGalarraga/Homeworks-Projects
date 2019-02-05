/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.inventorysystem.controller;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Josselyne Gutiérrez
 */
public class Validation {
    public static boolean isAnyEmpty(JTextField textField)
    {
        if(textField.getText().length()==0)
        {
            return true;
        }
        else
        {
             return false;
        
        }
    }
    
    public static void verificationJustLetters(char charValidation, JTextArea nameOfTheTextArea)
    {
        if(Character.isDigit(charValidation))
        {
            nameOfTheTextArea.setBackground(Color.red);
        }
        else
        {
            nameOfTheTextArea.setBackground(Color.WHITE);
            
        }
    } 
      
    
    
    public static void verificationJustNumbers(char charValidation, JTextField nameOfTheTextField)
    {
        if(Character.isDigit(charValidation))
        {
            nameOfTheTextField.setBackground(Color.WHITE);
        }
        else
        {
            nameOfTheTextField.setBackground(Color.red);
            
        }
    }
    
    
       public static void verificationJustLetters(char charValidation, JTextField nameOfTheTextField)
    {
        if(Character.isDigit(charValidation))
        {
            nameOfTheTextField.setBackground(Color.red);
        }
        else
        {
            nameOfTheTextField.setBackground(Color.WHITE);
            
        }
    }
    
}
