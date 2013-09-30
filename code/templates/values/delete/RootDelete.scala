package templates.values.delete

trait RootDelete {
  val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  //val PropertyName = "OneBool"
  //val PropertyClass = "boolean"

  //val PropertyDefaultValue = "false"

  //val PropertyValue = "true"
  //val PropertyValueTestName = "True"

  val rootRepositoryName = "oneBoolRootRepository"
  //val RootClassFactoryName = "OneBoolRootFactory"

  val Template = s"""

  // ========================= R O O T  D E L E T E  ${RootClass} =========================

   @Test
  /**
   * DELETE PERSISTED ROOT THEN FIND WITH REPOSITORY
   */
  public void deletePersistedRootThenFind() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass} root = new ${RootClass}();
    root.persist();

    final String persistedUri = root.getURI();

    root.delete();

    try {
      ${rootRepositoryName}.find(insertedUri).get(); // TODO FIXME PLEASE - i think this is find() function not get() and should return null if nothing found or at least throw NotFoundException
    } catch (ExecutionException e) { // piece of cake "error handling" - more like "it could be anything" string handling (no constants or enumeration)
      if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw new ExecutionException(e.getMessage()); // expect not found, rethrow unexpected error
    }
  }"""
}
