/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
import ec.edu.espe.Exception.model.Exceptions;
import ec.edu.espe.Exception.model.MyException;

/**
 *
 * @author Fernanda Galárraga
 */
public class Lab20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MyException {
       String user; 
       String pass;
       String repass;
       int birthDay;
       int birthMonth;
       int birthYear;
       /*user="Mafer99";
       pass="123abc";
       repass="123def";*/
       Scanner fx= new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        user=fx.nextLine();
        System.out.println("Ingrese su contraseña");
        pass=fx.nextLine();
        System.out.println("Confirmar contraseña");
        repass=fx.nextLine();
        System.out.println("Ingrese su día de nacimiento");
        birthDay=fx.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        birthMonth=fx.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        birthYear=fx.nextInt();
       Exceptions h = new Exceptions();
       try{
           h.validarPassword(pass, repass);
           
       }catch(MyException e){
           System.out.println("No se puede registrar debido a: "+e.getMessage());
      
      }
       try{
          h.validarDia(birthDay);
       }catch(MyException x){
           System.out.println("Su dia de nacimiento es incorrecto debido a que: " +x.getMessage());
       }
       try{
          h.validarMes(birthMonth);
       }catch(MyException y){
           System.out.println("Su mes de nacimiento es incorrecto debido a que: " +y.getMessage());
       }
       try{
          h.validarAño(birthYear);
       }catch(MyException z){
           System.out.println("Su año de nacimiento es incorrecto debido a que: " +z.getMessage());
       }
    }
    
}
