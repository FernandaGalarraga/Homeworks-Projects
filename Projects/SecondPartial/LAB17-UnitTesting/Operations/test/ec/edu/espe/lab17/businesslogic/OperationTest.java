/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab17.businesslogic;

import ec.edu.espe.Lab17.businesslogic.Operation;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernanda Galárraga
 */
public class OperationTest {
    
    public OperationTest() {
        
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
     * Test of add method, of class Operation.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        short operand1 = 0;
        short operand2 = 0;
        Operation instance = new Operation();
        short expResult = 0;
        short result = instance.add(operand1, operand2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testAddSimpleCases(){
        short operand1=1;
        short operand2=2;
        short expectedResult=3;
        Operation operation= new Operation();
        short actualResult=operation.add(operand1, operand2);
        
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1 + "+" + operand2 + "=" + expectedResult + "succeded");
        
        
        operand1=2;
        operand2=-1;
        expectedResult=1;
        actualResult=operation.add(operand1, operand2);
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1 + "+" + operand2 + "=" + expectedResult + "succeded");
        
        
        operand1=12;
        operand2=15;
        expectedResult=27;
        actualResult=operation.add(operand1, operand2);
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1 + "+" + operand2 + "=" + expectedResult + "succeded");
        
        
        operand1=0;
        operand2=5;
        expectedResult=5;
        actualResult=operation.add(operand1, operand2);
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1 + "+" + operand2 + "=" + expectedResult + "succeded");
        
        
        operand1=0;
        operand2=-8;
        expectedResult=-8;
        actualResult=operation.add(operand1, operand2);
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1 + "+" + operand2 + "=" + expectedResult + "succeded");
    }
    @Test
    public void wrongCases(){
        short operand1=15000;
        short operand2=16000;
        int expectedResult=21000;
        Operation operation= new Operation();
        short actualResult=operation.add(operand1, operand2);
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1 + "+" + operand2 + "=" + expectedResult + "succeded");
    }
    @Test
    public void charactersTest(){
        char operand1='1';
        char operand2='2';
        short expectedResult=3;
        Operation operation= new Operation();
        char actualResult=(char) operation.add((short)operand1,(short)operand2);
        assertEquals(expectedResult, actualResult);
        System.out.println(operand1 + "+" + operand2 + "=" + expectedResult + "succeded");
    }
}
