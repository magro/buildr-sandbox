package de.javakaffee.buildr.sandbox.testmodule2

import org.testng.annotations._
import org.testng.Assert._

class Test1 {
  
  @Test
  def testClass1 {
    fail("this test failed.")
  }

}