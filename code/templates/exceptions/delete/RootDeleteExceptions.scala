package templates.exceptions.delete

trait RootDeleteException {
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

  // ========================= ${RootClass}  D E L E T E  E X C E P T I O N S =========================

  @Test
  /**
   * DELETE NEW ${RootClass} THROWS ILLEGAL ARGUMENT EXCEPTION
   */
  public void rootDeleteError() throws IOException, ExecutionException, InterruptedException {
    final ${RootClass} root    = new ${RootClass}();
    try {
      root.delete();
    } catch (IllegalArgumentException e) {
      if (!e.getMessage().startsWith("uri can't be null.")) throw e;
    }
  }"""
}
