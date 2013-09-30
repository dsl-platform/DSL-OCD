package templates.values

trait CompareArrays {
  //val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  //val PropertyName = "OneBool"
  val PropertyClass = "boolean[]"

  //val PropertyDefaultValue = "false"

  //val rootRepositoryName = "oneBoolRootRepository"
  //val RootClassFactoryName = "OneBoolRootFactory"

  val Template = s"""

  // ========================= ${PropertyClass} VALUE COMPARER =========================

    private static boolean compareArrays(${PropertyClass} a, ${PropertyClass} b) {
    if (a == null && b != null) return false;
    if (a != null && b == null) return false;
    if (a == null && b == null) return true;
    if (a.length != b.length) return false;

    for (int index = 0; index < a.length; index++) {
      if (!a[index] == b[index]) return false;
    }
    return true;
  }"""
}
