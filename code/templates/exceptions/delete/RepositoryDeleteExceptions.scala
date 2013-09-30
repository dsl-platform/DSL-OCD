package templates.exceptions.delete

trait RepositoryDeleteException {
 val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  //val PropertyName = "OneBool"
  //val PropertyClass = "boolean"

  //val PropertyDefaultValue = "false"

  //val PropertyValue = "true"
  //val PropertyValueTestName = "True"

  val rootRepositoryName = "oneBoolRootRepository"
  val RootClassFactoryName = "OneBoolRootFactory"


  val Template = s"""

  // ========================= R E P O S I T O R Y  D E L E T E  ${RootClass}  E X C E P T I O N S =========================

  @Test
  public void repositoryDeleteException() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass} root = new ${RootClass}();

    try {
      ${rootRepositoryName}.delete(root).get();
    } catch (IllegalArgumentException e) {
      if (!e.getMessage().startsWith("uri can't be null.")) throw e;
    }
  }

  // ---------------------------------------------------------------------------

  @Test
  public void repositoryBatchDeleteMedumLargeArray() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass}[] roots = ${RootClassFactoryName}.make(1000).toArray();

    try {
      ${rootRepositoryName}.delete(roots).get();
    } catch (ExecutionException e) {
      if (!e.getMessage().startsWith("java.util.concurrent.ExecutionException: java.io.IOException: Unexpected return code: 400, response: ERROR: P0001: Deleted 0 row(s). Expected to delete 1000 row(s).")) throw e;
    }
  }

  // ---------------------------------------------------------------------------

  @Test
  public void RepositoryBatchDeleteLargeIterableException() throws IOException, ExecutionException, InterruptedException {
    final Iterable<${RootClass}> roots = ${RootClassFactoryName}.make(10000);

    try {
      ${rootRepositoryName}.delete(roots).get();
    } catch (ExecutionException e) {
      if (!e.getMessage().startsWith("java.util.concurrent.ExecutionException: java.io.IOException: Unexpected return code: 400, response: ERROR: P0001: Deleted 0 row(s). Expected to delete 10000 row(s).")) throw e;
    }
  }"""
}
