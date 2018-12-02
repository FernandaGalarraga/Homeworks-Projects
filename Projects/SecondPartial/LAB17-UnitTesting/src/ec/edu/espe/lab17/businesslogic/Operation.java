/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Lab17.businesslogic;

/**
 *
 * @author Fernanda Galárraga
 */
public class Operation {
    private short operand1;
    private short operand2;
    private short result;
   public short add(short operand1, short operand2){
    result= (short) (operand1+operand2);
    return result;
}
   }
