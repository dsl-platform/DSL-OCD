package templates.exceptions
/**
 * Can be more guards per type (eg. boolean[] == null, boolean[] = { true, false, null }
 */
trait NullGuard {
  val RootClass = "ArrBoolRoot"
  //val propertyName = "arrBool"
  val PropertyName = "ArrBool"
  val PropertyClass = "boolean[]"

  //val PropertyDefaultValue = "false"

  val PropertyValue = "null"
  val PropertyValueTestName = "objectValue"

  //val rootRepositoryName = "arrBoolRootRepository"
  //val RootClassFactoryName = "ArrBoolRootFactory"

  val Template = s"""

  // ------------------------- ${PropertyClass} NULL GUARD -------------------------

  @Test(expected=IllegalArgumentException.class)
  public void ${PropertyValueTestName}NullGuard() throws IOException {
    final ${RootClass} root = new ${RootClass}().set${PropertyName}(${PropertyValue});
  }"""
}
