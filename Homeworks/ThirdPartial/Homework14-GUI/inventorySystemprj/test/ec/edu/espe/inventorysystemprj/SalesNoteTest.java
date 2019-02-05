package ec.edu.espe.inventorysystemprj;

import ec.edu.espe.inventorysystemprj.cmd.SalesNote;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TopCoders
 */
public class SalesNoteTest {
    
    
    public SalesNoteTest() {
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
    public void testAddClothes() {
        System.out.println("addClothes");
        SalesNote instance = new SalesNote();
        instance.addClothes();
    }

    @Test
    public void testDeleteClothes() {
        System.out.println("deleteClothes");
        SalesNote instance = new SalesNote();
        instance.deleteClothes();
    }

    @Test
    public void testComputeChange() {
        System.out.println("computeChange");
        SalesNote instance = new SalesNote();
        float expResult = 0.0F;
        float result = instance.computeChange();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDate() {
        System.out.println("date");
        SalesNote instance = new SalesNote();
        String expResult = "";
        String result = instance.date();
        assertEquals(expResult, result);
    }


    @Test
    public void testComputeNumberTicket() {
        System.out.println("computeNumberTicket");
        SalesNote instance = new SalesNote();
        int expResult = 0;
        int result = instance.computeNumberTicket();
        assertEquals(expResult, result);
    }

    @Test
    public void testComputeTotal() {
        System.out.println("computeTotal");
        float price = 0.0F;
        int quantitySold = 0;
        SalesNote instance = new SalesNote();
        float expResult = 0.0F;
        float result = instance.computeTotal(price, quantitySold);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testAcumulateMoney() {
        System.out.println("acumulateMoney");
        SalesNote instance = new SalesNote();
        instance.acumulateMoney();

    }

    @Test
    public void testGetMoneyReceived() {
        System.out.println("getMoneyReceived");
        SalesNote instance = new SalesNote();
        float expResult = 0.0F;
        float result = instance.getMoneyReceived();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetMoneyReceived() {
        System.out.println("setMoneyReceived");
        float moneyReceived = 0.0F;
        SalesNote instance = new SalesNote();
        instance.setMoneyReceived(moneyReceived);
    }

    @Test
    public void testGetMoneyChange() {
        System.out.println("getMoneyChange");
        SalesNote instance = new SalesNote();
        float expResult = 0.0F;
        float result = instance.getMoneyChange();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetMoneyChange() {
        System.out.println("setMoneyChange");
        float moneyChange = 0.0F;
        SalesNote instance = new SalesNote();
        instance.setMoneyChange(moneyChange);

    }

    @Test
    public void testGetMoneyTotalToPay() {
        System.out.println("getMoneyTotalToPay");
        SalesNote instance = new SalesNote();
        float expResult = 0.0F;
        float result = instance.getMoneyTotalToPay();
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testSetMoneyTotalToPay() {
        System.out.println("setMoneyTotalToPay");
        float moneyTotalToPay = 0.0F;
        SalesNote instance = new SalesNote();
        instance.setMoneyTotalToPay(moneyTotalToPay);
    }

    @Test
    public void testGetDateStatus() {
        System.out.println("getDateStatus");
        SalesNote instance = new SalesNote();
        String expResult = "";
        String result = instance.getDateStatus();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDateStatus() {
        System.out.println("setDateStatus");
        String dateStatus = "";
        SalesNote instance = new SalesNote();
        instance.setDateStatus(dateStatus);

    }

    @Test
    public void testGetClothesQuantity() {
        System.out.println("getClothesQuantity");
        SalesNote instance = new SalesNote();
        int expResult = 0;
        int result = instance.getClothesQuantity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetClothesQuantity() {
        System.out.println("setClothesQuantity");
        int clothesQuantity = 0;
        SalesNote instance = new SalesNote();
        instance.setClothesQuantity(clothesQuantity);
    }
    
}
