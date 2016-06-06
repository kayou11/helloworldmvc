package org.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DAOHelloWorldTest {
   private DAOHelloWorld DAOHelloWorldTest;
   
   @Before
   public void setUp() throws Exception {
     this.DAOHelloWorldTest = new DAOHelloWorld();
   }
   
   @Test
   public void testDAOHelloWorldTest() {
	
	final boolean DAOHelloWorldOpen = true;
	 assertEquals(DAOHelloWorldOpen, this.DAOHelloWorldTest.open()); }
}