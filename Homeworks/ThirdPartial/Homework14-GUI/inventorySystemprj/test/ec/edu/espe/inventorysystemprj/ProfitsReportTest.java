package ec.edu.espe.inventorysystemprj;

import ec.edu.espe.inventorysystemprj.cmd.ProfitsReport;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Top Coders
 */
public class ProfitsReportTest {
    
    public ProfitsReportTest() {
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


    @Test
    public void testSimpleCasesComputeProfits(){
        float investment=1000.00f;
        float totalOfSalesMoney=1500.00f;
        float expectedResultProfits=500.00f;
        ProfitsReport profits = new ProfitsReport();
        profits.setTotalOfSalesMoney(1500.00f);
        profits.setInvestment(1000.00f);
        float actualResultProfits=profits.computeProfits();
        assertEquals(expectedResultProfits,actualResultProfits,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultProfits+" succeded"); 
        
    }
    @Test
    public void testWrongCaseComputeProfits1(){
        float investment=0;
        float totalOfSalesMoney=1500.00f;
        float expectedResultProfits=-1;
        ProfitsReport profits = new ProfitsReport();
        profits.setInvestment(0);
        profits.setTotalOfSalesMoney(1500.00f);
        float actualResultProfits=profits.computeProfits();
        assertEquals(expectedResultProfits,actualResultProfits,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultProfits+" succeded"); 
    }
    
    @Test
    public void testWrongCaseComputeProfits2(){
        float investment=-1;
        float totalOfSalesMoney=1500.00f;
        float expectedResultProfits=-1;
        ProfitsReport profits = new ProfitsReport();
        profits.setInvestment(-1);
        profits.setTotalOfSalesMoney(1500.00f);
        float actualResultProfits=profits.computeProfits();
        assertEquals(expectedResultProfits,actualResultProfits,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultProfits+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeProfits3(){
        float investment='s';
        float totalOfSalesMoney=1500.00f;
        float expectedResultProfits=-1;
        ProfitsReport profits = new ProfitsReport();
        profits.setInvestment('s');
        profits.setTotalOfSalesMoney(1500.00f);
        float actualResultProfits=profits.computeProfits();
        assertEquals(expectedResultProfits,actualResultProfits,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultProfits+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeProfits4(){
        float investment='#';
        float totalOfSalesMoney=1500.00f;
        float expectedResultProfits=-1;
        ProfitsReport profits = new ProfitsReport();
        profits.setInvestment('#');
        profits.setTotalOfSalesMoney(1500.00f);
        float actualResultProfits=profits.computeProfits();
        assertEquals(expectedResultProfits,actualResultProfits,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultProfits+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeProfits5(){
        float investment=1000.00f;
        float totalOfSalesMoney=0;
        float expectedResultProfits=-1;
        ProfitsReport profits = new ProfitsReport();
        profits.setInvestment(1000.00f);
        profits.setTotalOfSalesMoney(0f);
        float actualResultProfits=profits.computeProfits();
        assertEquals(expectedResultProfits,actualResultProfits,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultProfits+" succeded"); 
    }
     @Test
    public void testWrongCaseComputeProfits6(){
        float investment=1000.00f;
        float totalOfSalesMoney=-2;
        float expectedResultProfits=-1;
        ProfitsReport profits = new ProfitsReport();
        profits.setInvestment(1000.00f);
        profits.setTotalOfSalesMoney(-2f);
        float actualResultProfits=profits.computeProfits();
        assertEquals(expectedResultProfits,actualResultProfits,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultProfits+" succeded"); 
    }
     @Test
    public void testWrongCaseComputeProfits7(){
        float investment=1000.00f;
        float totalOfSalesMoney='s';
        float expectedResultProfits=-1;
        ProfitsReport profits = new ProfitsReport();
        profits.setInvestment(1000.00f);
        profits.setTotalOfSalesMoney('s');
        float actualResultProfits=profits.computeProfits();
        assertEquals(expectedResultProfits,actualResultProfits,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultProfits+" succeded"); 
    }
     @Test
    public void testWrongCaseComputeProfits8(){
        float investment=1000.00f;
        float totalOfSalesMoney='#';
        float expectedResultProfits=-1;
        ProfitsReport profits = new ProfitsReport();
        profits.setInvestment(1000.00f);
        profits.setTotalOfSalesMoney('#');
        float actualResultProfits=profits.computeProfits();
        assertEquals(expectedResultProfits,actualResultProfits,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultProfits+" succeded"); 
    }
    /*@Test
    public void testSimpleCaseComputeLosses1(){
        float investment=1000.00f;
        float totalOfSalesMoney=900.00f;
        float expectedResultLosses=-100.00f;
        ProfitsReport losses = new ProfitsReport();
        losses.setInvestment(1000.00f);
        losses.setTotalOfSalesMoney(900.00f);
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }
    @Test
    public void testSimpleCaseComputeLosses2(){
        float investment=1000.00f;
        float totalOfSalesMoney=1500.00f;
        float expectedResultLosses=0.00f;
        ProfitsReport losses = new ProfitsReport();
         losses.setInvestment(1000.00f);
        losses.setTotalOfSalesMoney(1500.00f);
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeLosses1(){
        float investment=0;
        float totalOfSalesMoney=900.00f;
        float expectedResultLosses=-1;
        ProfitsReport losses = new ProfitsReport();
        losses.setInvestment(0f);
        losses.setTotalOfSalesMoney(900.00f);
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeLosses2(){
        float investment=-2;
        float totalOfSalesMoney=900.00f;
        float expectedResultLosses=-1;
        ProfitsReport losses = new ProfitsReport();
        losses.setInvestment(-2f);
        losses.setTotalOfSalesMoney(900.00f);
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeLosses3(){
        float investment='s';
        float totalOfSalesMoney=900.00f;
        float expectedResultLosses=-1;
        ProfitsReport losses = new ProfitsReport();
        losses.setInvestment('s');
        losses.setTotalOfSalesMoney(900.00f);
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeLosses4(){
        float investment='#';
        float totalOfSalesMoney=900.00f;
        float expectedResultLosses=-1;
        ProfitsReport losses = new ProfitsReport();
        losses.setInvestment('#');
        losses.setTotalOfSalesMoney(900.00f);
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeLosses5(){
        float investment=1000.00f;
        float totalOfSalesMoney=0;
        float expectedResultLosses=-1;
        ProfitsReport losses = new ProfitsReport();
        losses.setInvestment(1000.00f);
        losses.setTotalOfSalesMoney(0f);
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeLosses6(){
        float investment=1000.00f;
        float totalOfSalesMoney=-2;
        float expectedResultLosses=-1;
        ProfitsReport losses = new ProfitsReport();
        losses.setInvestment(1000.00f);
        losses.setTotalOfSalesMoney(-2f);
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeLosses7(){
        float investment=1000.00f;
        float totalOfSalesMoney='s';
        float expectedResultLosses=-1;
        ProfitsReport losses = new ProfitsReport();
        losses.setInvestment(1000.00f);
        losses.setTotalOfSalesMoney('s');
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }
    @Test
    public void testWrongCaseComputeLosses8(){
        float investment=1000.00f;
        float totalOfSalesMoney='#';
        float expectedResultLosses=-1;
        ProfitsReport losses = new ProfitsReport();
        losses.setInvestment(1000.00f);
        losses.setTotalOfSalesMoney('#');
        float actualResultLosses=losses.computeLosses();
        assertEquals(expectedResultLosses,actualResultLosses,0.0f);
        System.out.println("Investment: "+investment+", total of sales money: "+totalOfSalesMoney+", actual result: "+actualResultLosses+" succeded"); 
    }*/
    
}
