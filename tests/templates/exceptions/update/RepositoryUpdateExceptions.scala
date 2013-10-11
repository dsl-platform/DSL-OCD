package templates.exceptions.update

trait RepositoryUpdateExceptions {
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

  // ========================= R E P O S I T O R Y  U P D A T E  ${RootClass}  E X C E P T I O N S =========================

  @Test // FIXME NotFoundException ?
  public void repositoryUpdateException() throws IOException, ExecutionException, InterruptedException {
    final ArrBoolRoot root    = new ArrBoolRoot();

    try {
      listArrRootRepository.update(root).get();
    } catch (IllegalArgumentException e) {
      if (!e.getMessage().startsWith("uri can't be null.")) throw e;
    }
  }
  """
}
