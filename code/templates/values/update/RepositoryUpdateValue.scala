package templates.values.update

trait RepositoryUpdateValue {
  val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  val PropertyName = "OneBool"
  val PropertyClass = "boolean"

  val PropertyDefaultValue = "false"

  val PropertyValue = "true"
  val PropertyValueTestName = "True"

  val rootRepositoryName = "oneBoolRootRepository"
  val RootClassFactoryName = "OneBoolRootFactory"


  val Template = s"""

  // ========================= R E P O S I T O R Y  U P D A T E  D E F A U L T  T O  ${PropertyValueTestName} =========================

  @Test
  /**
   * FIND INSERTED DEFAULT VALUE ${PropertyClass} AND UPDATE TO ${PropertyValueTestName}
   */
  public void updateDefaultValueByRepositoryInsertTo${PropertyValueTestName}() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass} root = new ${RootClass}();

    final String insertedUri = ${rootRepositoryName}.insert(root).get();

    final ${RootClass} insertedRoot = ${rootRepositoryName}.find(insertedUri).get();

    assertEquals(insertedRoot.getURI(), insertedUri);
    assertEquals(insertedRoot.get${PropertyName}(), ${PropertyDefaultValue});

    insertedRoot.setOneBool(${PropertyValue});

    final ${RootClass} updatedRoot = ${rootRepositoryName}.update(insertedRoot).get();
    assertEquals(insertedRoot.getURI(), updatedRoot.getURI());
    assertEquals(insertedRoot.get${PropertyName}(), updatedRoot.get${PropertyName}());
  }

  // ---------------------------------------------------------------------------

  @Test
  /**
   * FIND MEDIUM LARGE BATCH INSERTED DEFAULT VALUE ARRAY ${PropertyClass} AND UPDATE TO ${PropertyValueTestName}
   */
  public void updateDefaultValueByMedumLargeArrayBatchRepositoryInsertTo${PropertyValueTestName}() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass}[] roots = ${RootClassFactoryName}.make(1000).toArray();

    final List<String> insertedUris = ${rootRepositoryName}.insert(roots).get();
    final String[] insertedUrisArr = insertedUris.toArray(new String[insertedUris.size()]);

    final List<${RootClass}> insertedRoots = ${rootRepositoryName}.find(insertedUrisArr).get();
    final ${RootClass}[] insertedRootsArr = insertedRoots.toArray(new ${RootClass}[insertedRoots.size()]);

    for(final ${RootClass} root : insertedRoots) {
      assertEquals(root.get${PropertyName}(), ${PropertyDefaultValue});
      root.set${PropertyName}(${PropertyValue}); // set to new value
    }

    final List<String> updatedUris = ${rootRepositoryName}.update(insertedRootsArr).get();
    final String[] updatedUrisArr = updatedUris.toArray(new String[updatedUris.size()]);

    final List<${RootClass}> updatedRoots = ${rootRepositoryName}.find(updatedUrisArr).get(); //FIXME

    assertEquals(insertedRoots.size(), updatedRoots.size());
    assertTrue(updatedUris.containsAll(insertedUris));

    for(final ${RootClass} root : updatedRoots) {
      assertEquals(root.get${PropertyName}(), ${PropertyValue});
    }
  }

  // ---------------------------------------------------------------------------

  @Test
  /**
   * FIND LARGE BATCH INSERTED DEFAULT VALUE ITERABLE ${PropertyClass} AND UPDATE TO ${PropertyValueTestName}
   */
  public void updateInsertedLargeIterableBatchRepositoryDefaultValueTo${PropertyValueTestName}() throws IOException, ExecutionException, InterruptedException {
    final Iterable<${RootClass}> roots = ${RootClassFactoryName}.make(10000);

    final List<String> insertedUris = ${rootRepositoryName}.insert(roots).get();

    final List<${RootClass}> insertedRoots = ${rootRepositoryName}.find(insertedUris).get();

    for(final ${RootClass} root : insertedRoots) {
      assertEquals(root.get${PropertyName}(), ${PropertyDefaultValue});
      root.set${PropertyName}(${PropertyValue}); // set to new value
    }

    final List<String> updatedUris = ${rootRepositoryName}.update(insertedRoots).get();

    final List<${RootClass}> updatedRoots = ${rootRepositoryName}.find(updatedUris).get(); //FIXME

    assertEquals(insertedRoots.size(), updatedRoots.size());
    assertTrue(updatedUris.containsAll(insertedUris));

    for(final ${RootClass} root : updatedRoots) {
      assertEquals(root.get${PropertyName}(), ${PropertyValue});
    }
  }"""
}
