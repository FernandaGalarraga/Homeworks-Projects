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
public class Exceptions {

    public Exceptions() {
    }
    
    public void validarPassword(String pass, String reppass) throws MyException{
        if(!pass.equals(reppass)){
            throw new MyException("Los campos de password no coinciden");
        }
        if(pass.length()<8){
            throw new MyException("El password no es muy largo");       
        } 
        
    }
    public void validarDia(int birthDay) throws MyException{
        if(birthDay<0){
            throw new MyException("No existen días negativos");
        }else{
            if(birthDay>31){
                throw new MyException("Los días de cada mes máximo tienen 31");
            }
        }   
   }
    public void validarMes(int birthMonth) throws MyException{
        if(birthMonth<0){
            throw new MyException("No hay meses negativos");
        }else{
            if(birthMonth>12){
                throw new MyException("Un año tiene sólo doce meses");
            }
        }      
   }
    public void validarAño(int birthYear) throws MyException{
        if(birthYear<0){
            throw new MyException("No hay años negativos");
        }else{
            if(birthYear>2018){
                throw new MyException("Ya que el año actual es 2018, no puede ingresar años mayores al actual");
            }
        }         
   }
    
}
