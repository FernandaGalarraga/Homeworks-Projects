/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab21.businesslogic;

/**
 *
 * @author Fernanda Galárraga
 */
public class SellsPrice {
    private float base;
    private float tax=12;
    private float finalPrice;
    
    public void computeFinalPrice(){
        setFinalPrice(getBase()*getTax()/100+getBase());
    }
    
    @Override
    public String toString(){
    String text= "Object SalesPrice data---> tax="+ tax+"base"+base+"Final price"+finalPrice;    
       
        return text;    
    }
    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the tax
     */
    public float getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(float tax) {
        this.tax = tax;
    }

    /**
     * @return the finalPrice
     */
    public float getFinalPrice() {
        return finalPrice;
    }

    /**
     * @param finalPrice the finalPrice to set
     */
    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public SellsPrice(float base,float tax, float finalPrice) {
        this.base = base;
        this.tax=tax;
        this.finalPrice = finalPrice;
    }
    
}
