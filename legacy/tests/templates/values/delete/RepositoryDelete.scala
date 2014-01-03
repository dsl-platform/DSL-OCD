package templates.values.delete

trait RepositoryDelete {
 val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  val PropertyName = "OneBool"
  //val PropertyClass = "boolean"

  //val PropertyDefaultValue = "false"

  //val PropertyValue = "true"
  //val PropertyValueTestName = "True"

  val rootRepositoryName = "oneBoolRootRepository"
  val RootClassFactoryName = "OneBoolRootFactory"


  val Template = s"""

  // ========================= R E P O S I T O R Y  D E L E T E  ${RootClass} =========================

  @Test
  /**
   * DELETE REPOSITORY INSERTED ${RootClass} THEN FIND
   */
  public void deleteRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass} root = new ${RootClass}();

    final String insertedUri = ${rootRepositoryName}.insert(root).get();

    final ${RootClass} insertedRoot = ${rootRepositoryName}.find(insertedUri).get();

    ${rootRepositoryName}.delete(insertedRoot).get();

    try {
      ${rootRepositoryName}.find(insertedUri).get(); // TODO FIXME PLEASE - i think this is find() function not get() and should return null if nothing found or at least throw NotFoundException
    } catch (ExecutionException e) { // piece of cake "error handling" - more like "it could be anything" string handling (no constants or enumeration)
      if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw new ExecutionException(e.getMessage()); // expect not found, rethrow unexpected error
    }
  }

  // ---------------------------------------------------------------------------

  @Test
  /**
   * DELETE MEDIUM LARGE BATCH INSERTED ${RootClass} ARRAY THEN FIND
   */
  public void deleteMedumLargeArrayBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass}[] roots = ${RootClassFactoryName}.make(1000).toArray();

    final List<String> insertedUris = ${rootRepositoryName}.insert(roots).get();
    final String[] insertedUrisArr = insertedUris.toArray(new String[insertedUris.size()]);

    final List<${RootClass}> insertedRoots = ${rootRepositoryName}.find(insertedUrisArr).get();
    final ${RootClass}[] insertedRootsArr = insertedRoots.toArray(new ${RootClass}[insertedRoots.size()]);

    ${rootRepositoryName}.delete(insertedRootsArr).get();

    final List<${RootClass}> deletedRoots = ${rootRepositoryName}.find(insertedUrisArr).get();
    assertEquals(deletedRoots.size(), 0);
  }

  // ---------------------------------------------------------------------------

  @Test
  /**
   * DELETE LARGE BATCH INSERTED ${RootClass} ITERABLE THEN FIND
   */
  public void deleteLargeIterableBatchRepositoryInsert() throws IOException, ExecutionException, InterruptedException {
    final Iterable<${RootClass}> roots = ${RootClassFactoryName}.make(10000);

    final List<String> insertedUris = ${rootRepositoryName}.insert(roots).get();

    final List<${RootClass}> insertedRoots = ${rootRepositoryName}.find(insertedUris).get();

    ${rootRepositoryName}.delete(insertedRoots).get();

    final List<${RootClass}> deletedRoots = ${rootRepositoryName}.find(insertedUris).get();
    assertEquals(deletedRoots.size(), 0);
  }"""
}
