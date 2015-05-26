/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dpazolopez
 */
public class Calcula2Test {
    
    public Calcula2Test() {
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
     * Test of realizaOperacion method, of class Calcula2.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        float num1 = 25.0F;
        float num2 = 12.0F;
        int oper = 2;
        float expResult = 13.0F;
        float result = Calcula2.realizaOperacion(num1, num2, oper);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
