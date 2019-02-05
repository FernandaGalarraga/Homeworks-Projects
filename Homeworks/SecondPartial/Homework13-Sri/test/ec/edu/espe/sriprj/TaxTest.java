/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sriprj;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Byron Condor, Mafer Galárraga, Josselyne Gutiérrez
 */
public class TaxTest {
    
    public TaxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dataIncomes method, of class Tax.
     */
   @Test
   public void taxTest(){
        System.out.println("TAX");
        float salaryC = 1200F;
        Tax instance = new Tax();
        float expResult = 88.46F;
        float result = instance.computeTaxes(salaryC);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("\nTAX");
        salaryC = 1500F;
        expResult = 348.9F;
        result = instance.computeTaxes(salaryC);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("\nTAX");
        salaryC = 750F;
        expResult = 0F;
        result = instance.computeTaxes(salaryC);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("\nTAX");
        salaryC = 5000F;
        expResult = 6424F;
        result = instance.computeTaxes(salaryC);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("\nTAX");
        salaryC = 7200F;
        expResult = 11885.3F;
        result = instance.computeTaxes(salaryC);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("\nTAX");
        salaryC = 3500F;
        expResult = 3418.15F;
        result = instance.computeTaxes(salaryC);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("\nTAX");
        salaryC = 8456F;
        expResult = 15582.87F;
        result = instance.computeTaxes(salaryC);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
        
        System.out.println("\nTAX");
        salaryC = 9045F;
        expResult = 17502.89F;
        result = instance.computeTaxes(salaryC);
        assertEquals(expResult, result, 0.0);
        System.out.println(expResult+"="+result+" SUCCEDD");
   }
   
   
   
    @Test
   public void computeFeeTest(){
        System.out.println("\nFees");
        float ir = 1500F;
        Tax instance = new Tax();
        instance.computeTaxes(ir);
        ArrayList<Float> results = new ArrayList<>();
        results=instance.computeMonthlyFee();
        assertEquals(29.08f,results.get(0) , 0.0);
        assertEquals(29.02f,results.get(1) , 0.0);
        System.out.println(" SUCCED");
        
   }
   
    
}
