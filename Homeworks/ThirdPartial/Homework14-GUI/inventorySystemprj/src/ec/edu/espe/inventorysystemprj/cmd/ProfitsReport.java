
package ec.edu.espe.inventorysystemprj.cmd;

import ec.edu.espe.inventorysystemprj.utils.FilePrj;

/**
 * @author TopCoders
 */
public class ProfitsReport {
    
        
    private float investment;
    private float profits;
    private float totalOfSalesMoney;

 

    public float getInvestment() {
        return investment;
    }

    public void setInvestment(float investment) {
        this.investment = investment;
    }

    public float getProfits() {
        return profits;
    }

    public float getTotalOfSalesMoney() {

        return totalOfSalesMoney;
    }

    public void setTotalOfSalesMoney(float totalOfSalesMoney) {
        this.totalOfSalesMoney = totalOfSalesMoney;
    }

    /**
     * Method that compute the profits obtained in the sale
     * @return the profits obtained in the sale  
     */
    public float computeProfits()
    {
         this.profits=this.totalOfSalesMoney-this.investment;
        if(this.profits<=0){
            return -1;
        }else{
            return this.profits;
        }

    }
    

}

