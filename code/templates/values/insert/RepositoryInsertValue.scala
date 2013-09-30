package templates.values.insert

trait RepositoryInsertValue {
  val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  val PropertyName = "OneBool"
  //val PropertyClass = "boolean"

  //val PropertyDefaultValue = "false"

  val PropertyValue = "true"
  val PropertyValueTestName = "True"

  val rootRepositoryName = "oneBoolRootRepository"
  val RootClassFactoryName = "OneBoolRootFactory"

  val Template = s"""

  // ========================= R E P O S I T O R Y  I N S E R T  ${PropertyValueTestName} =========================

  @Test
  /**
   * FIND INSERTED ${PropertyValueTestName} VALUE WITH REPOSITORY
   */
  public void insert${PropertyValueTestName}ValueWithRepository() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass} root = new ${RootClass}().set${PropertyName}(${PropertyValue});

    final String insertedUri = ${rootRepositoryName}.insert(root).get();

    final ${RootClass} insertedRoot = ${rootRepositoryName}.find(insertedUri).get();
    assertEquals(insertedRoot.getURI(), insertedUri);
    assertEquals(insertedRoot.get${PropertyName}(), ${PropertyValue});
  }

  // ---------------------------------------------------------------------------

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED ${PropertyValueTestName} VALUE ARRAY
   */
  public void ${PropertyValueTestName}ValueByMedumLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass}[] roots = ${RootClassFactoryName}.make(1000).setDefaultValue(${PropertyValue}).toArray();

    final List<String> insertedUris = ${rootRepositoryName}.insert(roots).get();
    final String[] insertedUrisArr = insertedUris.toArray(new String[insertedUris.size()]);

    assertEquals(insertedUris.size(), 1000);

    final List<${RootClass}> insertedRoots = ${rootRepositoryName}.find(insertedUrisArr).get();
    assertEquals(insertedRoots.size(), 1000);

    for(final ${RootClass} root : insertedRoots) {
      assertEquals(root.get${PropertyName}(), ${PropertyValue});
    }
  }

  // ---------------------------------------------------------------------------

  @Test
  /**
   * FIND LARGE BATCH INSERTED ${PropertyValueTestName} VALUE ITERABLE
   */
  public void ${PropertyValueTestName}ValueByLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<${RootClass}> roots = ${RootClassFactoryName}.make(10000).setDefaultValue(${PropertyValue});

    final List<String> insertedUris = ${rootRepositoryName}.insert(roots).get();

    assertEquals(insertedUris.size(), 10000);

    final List<${RootClass}> insertedRoots = ${rootRepositoryName}.find(insertedUris).get();
    assertEquals(insertedRoots.size(), 10000);

    for(final ${RootClass} root : insertedRoots) {
      assertEquals(root.get${PropertyName}(), ${PropertyValue});
    }
  }"""
}
