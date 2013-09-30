package templates.values.update

trait RootUpdateValue {
  val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  val PropertyName = "OneBool"
  val PropertyClass = "boolean"

  val PropertyDefaultValue = "false"

  val PropertyValue = "true"
  val PropertyValueTestName = "True"

  val rootRepositoryName = "oneBoolRootRepository"
  //val RootClassFactoryName = "OneBoolRootFactory"


  val Template = s"""

  // ========================= P E R S I S T  U P D A T E  D E F A U L T  T O  ${PropertyValueTestName} =========================

  @Test
  /**
   * UPDATE PERSISTED DEFAULT VALUE ${PropertyClass} TO ${PropertyValueTestName} USING PERSIST
   */
  public void persistDefaultValueAndUpdateTo${PropertyValueTestName}WithPersist() throws IOException {
    final ${RootClass} root = new ${RootClass}();
    root.persist();

    assertEquals(root.get${PropertyName}(), ${PropertyDefaultValue}); // ALSO TESTS INSERT DEFAULT VALUE

    root.set${PropertyName}(${PropertyValue})
    root.persist();

    assertEquals(root.get${PropertyName}(), ${PropertyValue});
  }

  // ---------------------------------------------------------------------------

  @Test
  /**
   * UPDATE PERSISTED DEFAULT VALUE ${PropertyClass} TO ${PropertyValueTestName} AND FIND WITH REPOSITORY
   */
  public void persistDefaultValueAndUpdateTo${PropertyValueTestName}WithPersistThenFind() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass} root = new ${RootClass}();
    root.persist();

    final String persistedUri = root.getURI();

    root.set${PropertyName}(${PropertyValue})
    root.persist();

    final ${RootClass} updatedRoot = ${rootRepositoryName}.find(persistedUri).get();
    assertEquals(updatedRoot.getURI(), persistedUri);
    assertEquals(updatedRoot.get${PropertyName}(), ${PropertyValue});
  }"""
}
