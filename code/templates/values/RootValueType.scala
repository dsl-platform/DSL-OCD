package templates.values

trait RootValueType {
  val RootClass = "OneBoolRoot"
  val propertyName = "oneBool"
  val PropertyName = "OneBool"
  val PropertyClass = "boolean"

  //val PropertyDefaultValue = "false"

  //val PropertyValue = "true"
  //val PropertyTestName = "True"

  //val rootRepositoryName = "oneBoolRootRepository"
  //val RootClassFactoryName = "OneBoolRootFactory"

  val Template = s"""

  // ========================= V A L U E  T Y P E  =  ${PropertyClass} =========================

  @Test
  /**
   * DEFAULT TYPE
   */
  public void ${propertyName}Type() throws Exception {
    assertEquals(${RootClass}.class.getDeclaredField("${propertyName}").getType(), ${PropertyClass}.class);
    assertEquals(${RootClass}.class.getMethod("get${PropertyName}").getReturnType(), ${PropertyClass}.class);
    assertEquals(${RootClass}.class.getMethod("set${PropertyName}", ${PropertyClass}.class).getReturnType(), ${RootClass}.class);
 }"""

}
