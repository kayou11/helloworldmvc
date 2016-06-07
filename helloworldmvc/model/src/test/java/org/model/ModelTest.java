package org.model;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class ModelTest {
   private Model modelTest;
   
   @Before
   public void setUp() throws Exception {
     this.modelTest = new Model();
   }
   @Test
   public void testGetHelloWorld() throws SQLException {
	 assertEquals("Hello World", this.modelTest.getHelloWorld()); }
}