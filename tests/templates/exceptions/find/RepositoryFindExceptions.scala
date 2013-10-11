package templates.exceptions.find

trait RepositoryFindExceptions {
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

  // ========================= R E P O S I T O R Y  F I N D  ${RootClass}  E X C E P T I O N S =========================
  @Test
  public void repositoryFindSingleUriException() throws IOException, ExecutionException, InterruptedException {
    try {
      ${rootRepositoryName}.find("1234567890").get();
    } catch (ExecutionException e) {
      if (!e.getMessage().startsWith("java.io.IOException: Unexpected return code: 404, response: Can't find")) throw e;
    }
  }

  // ---------------------------------------------------------------------------

  @Test
  public void repositoryFindNullUriException() throws IOException, ExecutionException, InterruptedException {
    try {
      ${rootRepositoryName}.find((String)null).get();
    } catch (IllegalArgumentException e) {
      if (!e.getMessage().startsWith("uri can't be null.")) throw e;
    }
  }
  """
}
