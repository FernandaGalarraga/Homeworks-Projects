/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exceptions.operations;

/**
 *
 * @author Fernanda Galárraga
 */
public class Operation {
    public float divide(float dividend, float divider)
    {
        float quotient;
        quotient=dividend/divider;
        return quotient;
    }
    
    
    public float add (float operand1, float operand2)
    {
        float result;
        result=operand1+operand2;
        return result;
    }
    
    public short add(short operand1, short operand2)
    {
        short result;
        result=(short) (operand1+operand2);
        return result;
    }
    
    
}
