package org.model;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class DAOHelloWorldTest {
   private DAOHelloWorld DAOHelloWorldTest;
   
   @Before
   public void setUp() throws Exception {
     this.DAOHelloWorldTest = new DAOHelloWorld();
   }
   
   @Test
   public void testDAOHelloWorldTest() throws SQLException {
	
	final boolean DAOHelloWorldOpen = true;
	 assertEquals(DAOHelloWorldOpen, this.DAOHelloWorldTest.open()); 
	}
}