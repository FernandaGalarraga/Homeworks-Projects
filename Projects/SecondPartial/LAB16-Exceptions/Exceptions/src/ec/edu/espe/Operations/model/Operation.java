/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Operations.model;

/**
 *
 * @author Fernanda Galárraga
 */
public class Operation {
    public float divide(float dividend, float divider){
        float quotient;
        quotient = dividend/divider;
        return quotient;
    }
    public float add(float operand1, float operand2){
        float result;
        result=operand1+operand2;
        return result;
    }
    public short add(short op1,short op2){
        short result1;
        result1 = (short) (op1 + op2);
        return result1;
    }
}
