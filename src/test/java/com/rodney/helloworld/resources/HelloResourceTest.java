/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rodney.helloworld.resources;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author roderick.warren
 */
public class HelloResourceTest {
    
    public HelloResourceTest() {
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
     * Test of getGreeting method, of class HelloResource.
     */
    @org.junit.Test
    // To Ignore this test, uncomment the line Ignore annotation
    // @Ignore
    public void testGetGreeting() {
        System.out.println("getGreeting");
        HelloResource instance = new HelloResource();
        String expResult = "Hello JAVA World";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        // default call to automatically fail the test. It can be removed as it is only for testing.
        // fail("The test case is a prototype.");
    }
    
}
