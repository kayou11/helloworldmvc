package org.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ModelTest {
   private Model modelTest;
   
   @Before
   public void setUp() throws Exception {
     this.modelTest = new Model();
   }
   @Test
   public void testGetHelloWorld() {
	 assertEquals("Hello World", this.modelTest.getHelloWorld()); }
}