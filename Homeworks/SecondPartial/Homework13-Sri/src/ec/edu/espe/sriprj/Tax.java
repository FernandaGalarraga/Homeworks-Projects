/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sriprj;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Byron Condor, Mafer Galárraga, Josselyne Gutiérrez
 */
public class Tax {
    
  
   private float salary;
   private float salaryYear;
   private float bcir;
   private float basicFraction;
   private float surplusFraction;
   private float ir;
 
   public float dataIncomes()
   {
       Scanner sc =new Scanner(System.in);
       System.out.println("Ingrese su sueldo mensual");
       do{
       this.salary=sc.nextFloat();  
        //if(salaryC<0)
           System.out.println("ingrese solo cantidades positivas");
       }while(salary<0);
       return salary;
   }
   
   public float computeTaxes(float salaryC)
   {
       this.salaryYear= salaryC*12;
       bcir= (float) (salaryYear-(0.0945*salaryYear));

        if ((bcir>=0)&&(bcir<11270))
            {
                basicFraction=0;
                surplusFraction=(11270-bcir)*0;
                ir= basicFraction+surplusFraction;
                System.out.println("Su impuesto a la renta es de: "+getIr());
            }
        else
                if ((bcir>=11270)&&(bcir<14360))
                {
                    basicFraction=0;
                    surplusFraction= (float) ((bcir-11270)*0.05);
                    ir=basicFraction+surplusFraction;
                    System.out.println("Su impuesto a la renta es de: "+getIr());
                }
                else
                    if ((bcir>=14360)&&(bcir<17950))
                {
                    basicFraction=155;
                    surplusFraction=  (float) ((bcir-14360)*0.1);
                    ir=basicFraction+surplusFraction;
                    System.out.println("Su impuesto a la renta es de: "+getIr());
                }
                    else
                        if ((bcir>=17950)&&(bcir<21550))
                    {
                        basicFraction=514;
                        surplusFraction=  (float) ((bcir-17950)*0.12);
                        ir=basicFraction+surplusFraction;
                        System.out.println("Su impuesto a la renta es de: "+getIr());
                    }
                        else
                            if ((bcir>=21550)&&(bcir<43100))
                            {
                                basicFraction=946;
                                surplusFraction=  (float) ((bcir-21550)*0.15);
                                ir=basicFraction+surplusFraction;
                                System.out.println("Su impuesto a la renta es de: "+getIr());
                            }
                            else
                                if ((bcir>=43100)&&(bcir<64630))
                            {
                                basicFraction=4178;
                                surplusFraction=(float) ((bcir-43100)*0.2);
                                ir=basicFraction+surplusFraction;
                                System.out.println("Su impuesto a la renta es de: "+getIr());
                            }
                                else
                                    if ((bcir>=64630)&&(bcir<86180))
                                {
                                    basicFraction=8484;
                                    surplusFraction= (float) ((bcir-64630)*0.25);
                                    ir=basicFraction+surplusFraction;
                                    System.out.println("Su impuesto a la renta es de: "+getIr());
                                }
                                    else
                                        if ((bcir>=86180)&&(bcir<114890))
                            {
                                basicFraction=13872;
                                surplusFraction=  (float) ((bcir-86180)*0.3);
                                ir=basicFraction+surplusFraction;
                                System.out.println("Su impuesto a la renta es de: "+getIr());
                            }
                                    else
                                    {
                                        basicFraction=224850;
                                        surplusFraction= (float) ((bcir-114890)*0.35);
                                        ir=basicFraction+surplusFraction;
                                        System.out.println("Su impuesto a la renta es de: "+getIr());
                                    }
        
        return getIr();
       }
   
   /**
    * Method that compute monthly fees
    * @return an array list in the first the fees form january to November and the seccond space the december fee
    */
    public ArrayList<Float> computeMonthlyFee ()
    {
        float monthlyFee;
        monthlyFee = this.ir/12f;
        monthlyFee = Math.round(monthlyFee*100f)/100f;
        System.out.println(monthlyFee);
        ArrayList<Float> fees = new ArrayList<>();
        fees.add(monthlyFee);
        monthlyFee=Math.round((this.ir-11*monthlyFee)*100f)/100f;
        fees.add(monthlyFee);
        System.out.println(fees.get(1));
        return fees;
    }
   
   
   
   
   

    public Tax() {
    }

    public float getIr() {
         BigDecimal bd = new BigDecimal(ir);
     bd = bd.setScale(2, RoundingMode.HALF_UP);
     return (float) bd.doubleValue();
    } 

    

    
}


