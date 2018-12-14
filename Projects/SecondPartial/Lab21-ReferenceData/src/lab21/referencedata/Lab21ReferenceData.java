/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21.referencedata;

import ec.edu.espe.lab21.businesslogic.SellsPrice;

/**
 *
 * @author Fernanda Galárraga
 */
public class Lab21ReferenceData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base=10f;
        float tax=12f;
        float finalPrice=0f;
        System.out.println("Base"+base+","+","+"Tax"+tax+"Final Price"+finalPrice);
        computeFinalPrice(base,tax,finalPrice);
        System.out.println("Base"+base+","+","+"Tax"+tax+"Final Price"+finalPrice);
        
        
        SellsPrice sellsPrice=new SellsPrice(20f,12f,0f);
        sellsPrice.computeFinalPrice();
        System.out.println(sellsPrice);
        
        sellsPrice=new SellsPrice(20f,10f,0f);
        System.out.println(sellsPrice);
        computeFinalPrice(sellsPrice);
        System.out.println("Printing from main-->"+sellsPrice);
        
        Integer integer= new Integer(10);
        System.out.println("Integer"+integer);
        changeInteger(integer);
        System.out.println("Integer"+integer);
    }
    public static void computeFinalPrice(float mBase,float mTax, float mFinalPrice){
        mFinalPrice=mBase*mTax/100+mBase;
        mBase=10;
        System.out.println("Base"+mBase+","+","+"Tax"+mTax+"Final Price"+mFinalPrice);
    }
    
    public static void computeFinalPrice(SellsPrice mSellsPrice){
        mSellsPrice.setFinalPrice(mSellsPrice.getBase()*mSellsPrice.getTax()/100+mSellsPrice.getBase());
        System.out.println(mSellsPrice);
    }
    
    public static void changeInteger(Integer integer){
        integer=integer*integer;
        System.out.println("Integer"+integer);
    }
}
