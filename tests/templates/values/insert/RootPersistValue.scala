package templates.values.insert

trait RootPersistValue {
  val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  val PropertyName = "OneBool"
  //val PropertyClass = "boolean"

  //val PropertyDefaultValue = "false"

  val PropertyValue = "true"
  val PropertyValueTestName = "True"

  val rootRepositoryName = "oneBoolRootRepository"
  //val RootClassFactoryName = "OneBoolRootFactory"

  val Template = s"""

  // ========================= P E R S I S T  I N S E R T  ${PropertyValueTestName} =========================

  @Test
  /**
   * PERSIST ${PropertyValueTestName} VALUE
   */
  public void persist${PropertyValueTestName}Value() throws IOException {
    final ${RootClass} root = new ${RootClass}().set${PropertyName}(${PropertyValue});
    root.persist();

    assertEquals(root.get${PropertyName}(), ${PropertyValue});
  }

  // ---------------------------------------------------------------------------

  @Test
  /**
   * PERSISTED ${PropertyValueTestName} VALUE AND FIND WITH REPOSITORY
   */
  public void persist${PropertyValueTestName}ValueThenFind() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass} root = new ${RootClass}().set${PropertyName}(${PropertyValue});
    root.persist();

    final String insertedUri = root.getURI();

    final ${RootClass} retRoot = ${rootRepositoryName}.find(insertedUri).get();
    assertEquals(retRoot.getURI(), insertedUri);
    assertEquals(retRoot.get${PropertyName}(), ${PropertyValue});
  }"""
}
