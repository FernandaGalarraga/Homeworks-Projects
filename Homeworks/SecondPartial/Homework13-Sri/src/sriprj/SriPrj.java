/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sriprj;

import ec.edu.espe.sriprj.Tax;

/**
 *
 * @author Byron Condor, Mafer Galárraga, Josselyne Gutiérrez
 */
public class SriPrj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tax tax=new Tax();
       float salary = tax.dataIncomes();
        tax.computeTaxes(salary);
        tax.computeMonthlyFee();
    }
    
}
