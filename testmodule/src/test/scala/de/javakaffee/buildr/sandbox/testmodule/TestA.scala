package de.javakaffee.buildr.sandbox.testmodule

import org.testng.annotations._
import org.testng.Assert._

class TestA extends BaseTest {
  
  @Test
  def testClass1 {
    val class1 = new Class1
    assertNotNull(class1)
  }

}
