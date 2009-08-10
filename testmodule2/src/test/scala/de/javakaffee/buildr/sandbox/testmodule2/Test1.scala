package de.javakaffee.buildr.sandbox.testmodule2

import org.testng.annotations._
import org.testng.Assert._

class Test1 {
  
  @BeforeMethod
  def beforeBaseTestMethod {
    //throw new RuntimeException("s.th. failed here...")
  }
  
  @Test
  def testBase {
    val class1 = new Class1
    assertNotNull(class1)
  }

}
