/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab9.model;

import java.util.Scanner;

/**
 *
 * @author Josselyne Gutierrez / Maria Fernanda Galarraga
 */
public class Operation {
    private int operand1;
     private int operand2;
     private int result;

    public Operation(int operand1, int operand2, int result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }

    
    public int add(int operand1, int operand2){
   
        result = operand1 + operand2;
                    System.out.println("The result is: " + result);

        return result;
    }
    public int substract(int operand1, int operand2){
        operand2*=-1;
        result = add(operand1,operand2);

        return result;
    }
    public int mult(int operand1, int operand2){
        int acum=0;
        for(int i=0; i<operand2; i++){
            acum=acum+operand1;
        }
        result=acum;
        System.out.println("The result is: " + result);

        return result;
    }
    public int div(int operand1, int operand2){
         int cont=0;
        if (operand2 >0){
            while(operand1>=0){
            operand1=operand1-operand2;
            cont=cont+1;
            }
            cont --;
         System.out.println("The result is: " + cont);
         return cont;
            }else{
            System.out.println("Enter another number");
            System.out.println("Enter the second number");
        Scanner sc = new Scanner(System.in);
        operand2 = sc.nextInt();
            }
        return 0;
        }

    /**
     * @return the operand1
     */
    public int getOperand1() {
        return operand1;
    }

    /**
     * @param operand1 the operand1 to set
     */
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    /**
     * @return the operand2
     */
    public int getOperand2() {
        return operand2;
    }

    /**
     * @param operand2 the operand2 to set
     */
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    /**
     * @return the result
     */
    public int getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(int result) {
        this.result = result;
    }
}
