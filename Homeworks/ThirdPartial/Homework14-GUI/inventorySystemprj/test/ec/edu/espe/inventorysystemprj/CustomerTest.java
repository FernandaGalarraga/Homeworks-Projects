package ec.edu.espe.inventorysystemprj;

import ec.edu.espe.inventorysystemprj.cmd.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victor Jimenez
 */
public class CustomerTest {
    
    public CustomerTest() {
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
    public void testSetPhone() {
        System.out.println("setPhone");
        long phone = 0L;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setPhone(phone);
        assertEquals(expResult, result);
  
    }
     @Test
    public void testSetPhone1() {
        System.out.println("setPhone");
        long phone = 984565509L;
        Customer instance = new Customer();
        boolean expResult = true;
        boolean result = instance.setPhone(phone);
        assertEquals(expResult, result);
  
    }
       @Test
    public void testSetPhone2() {
        System.out.println("setPhone");
        long phone = 22614991L;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setPhone(phone);
        assertEquals(expResult, result);
  
    }
    @Test
    public void testSetPhone3() {
        System.out.println("setPhone");
        long phone = 984L;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setPhone(phone);
        assertEquals(expResult, result);
  
    }
    @Test
    public void testSetPhone4() {
        System.out.println("setPhone");
        long phone = 0334L;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setPhone(phone);
        assertEquals(expResult, result);
  
    }

    @Test
    public void testSetPhone5() {
        System.out.println("setPhone");
        long phone = 85667L;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setPhone(phone);
        assertEquals(expResult, result);
  
    }
    
     @Test
    public void testSetPhone6() {
        System.out.println("setPhone");
        long phone = 55597845l;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setPhone(phone);
        assertEquals(expResult, result);
  
    }
    
        
     @Test
    public void testSetPhone7() {
        System.out.println("setPhone");
        long phone = 999763416L;
        Customer instance = new Customer();
        boolean expResult = true;
        boolean result = instance.setPhone(phone);
        assertEquals(expResult, result);
  
    }
    
     @Test
    public void testSetPhone8() {
        System.out.println("setPhone");
        long phone = 1L;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setPhone(phone);
        assertEquals(expResult, result);
  
    }

    @Test
    public void testSetNameAndSurname1() {
        System.out.println("setNameAndSurname");
        String nameAndSurname = "0";
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setNameAndSurname(nameAndSurname);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testSetNameAndSurname2() {
        System.out.println("setNameAndSurname");
        String nameAndSurname = "c";
        Customer instance = new Customer();
        boolean expResult = true;
        boolean result = instance.setNameAndSurname(nameAndSurname);
        assertEquals(expResult, result);
      
    }
      @Test
    public void testSetNameAndSurname3() {
        System.out.println("setNameAndSurname");
        String nameAndSurname = "Jose03";
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setNameAndSurname(nameAndSurname);
        assertEquals(expResult, result);
      
    }

      @Test
    public void testSetNameAndSurname4() {
        System.out.println("setNameAndSurname");
        String nameAndSurname = "Carlos@";
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setNameAndSurname(nameAndSurname);
        assertEquals(expResult, result);
      
    }
    
    
      @Test
    public void testSetNameAndSurname5() {
        System.out.println("setNameAndSurname");
        String nameAndSurname = "Juan Jose";
        Customer instance = new Customer();
        boolean expResult = true;
        boolean result = instance.setNameAndSurname(nameAndSurname);
        assertEquals(expResult, result);
      
    }
    
      @Test
    public void testSetNameAndSurname6() {
        System.out.println("setNameAndSurname");
        String nameAndSurname = "camilo87w7";
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setNameAndSurname(nameAndSurname);
        assertEquals(expResult, result);
      
    }
    
        @Test
    public void testSetNameAndSurname8() {
        System.out.println("setNameAndSurname");
        String nameAndSurname = "Jazz7u7";
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.setNameAndSurname(nameAndSurname);
        assertEquals(expResult, result);
      
    }
    
    
    @Test
    public void testId1() {
        int expectedId = 1725082786;
        Customer instance = new Customer();
        boolean expResult = true;
        boolean result = instance.id(expectedId);
        assertEquals(expResult, result);
        
    }
     
    @Test
    public void testId2() {
        int expectedId = -1;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.id(expectedId);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testId3() {
        int expectedId = (int)'c';
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.id(expectedId);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testId4() {
        int expectedId = 150;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.id(expectedId);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testId5() {
        int expectedId = 175887646;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.id(expectedId);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testId6() {
        int expectedId = 0255453647;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.id(expectedId);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testId7() {
        int expectedId = -880;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.id(expectedId);
        assertEquals(expResult, result);
        
    }
    
       @Test
    public void testId8() {
        int expectedId = 9044;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.id(expectedId);
        assertEquals(expResult, result);
        
    }
    
    
}
