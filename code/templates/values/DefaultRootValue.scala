package templates.values

trait DefaultRootValue {
  val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  val PropertyName = "OneBool"
  //val PropertyClass = "boolean"

  val PropertyDefaultValue = "false"

  //val rootRepositoryName = "oneBoolRootRepository"
  //val RootClassFactoryName = "OneBoolRootFactory"

  val Template = s"""

  // ========================= D E F A U L T  V A L U E  =  ${PropertyDefaultValue} =========================

  @Test
  /**
   * DEFAULT VALUE
   */
  public void defaultValue() throws IOException {
    final ${RootClass} root = new ${RootClass}();

    assertEquals(root.get${PropertyName}(), ${PropertyDefaultValue});
  }"""
}
