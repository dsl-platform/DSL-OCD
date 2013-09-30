package com.dslplatform.ocd

trait TestOptSetOptBoolInValueJava
    extends TestOptSetOptPropertyInValueJava
    with TestOptSetOptBoolInValueDsl {
  val tests = """
  @Test
  /**
   *
   */
/*  public void ${propertyName}Type() throws Exception {
    assertEquals(${RootClass}.class.getDeclaredField("${propertyName}").getType(), ${PropertyClass}.class);
    assertEquals(${RootClass}.class.getMethod("get${PropertyName}").getReturnType(), ${PropertyClass}.class);
    assertEquals(${RootClass}.class.getMethod("set${PropertyName}", ${PropertyClass}.class).getReturnType(), ${RootClass}.class);
 }*/
"""
}
