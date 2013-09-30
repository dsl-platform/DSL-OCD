package templates

trait CreateClassIterableFactory {
  val RootClass = "OneBoolRoot"
  //val propertyName = "oneBool"
  val PropertyName = "OneBool"
  val PropertyClass = "boolean"

  val PropertyDefaultValue = "false"

  //val PropertyValue = "true"
  //val PropertyTestName = "True"

  //val rootRepositoryName = "oneBoolRootRepository"
  val RootClassFactoryName = "OneBoolRootFactory"

  val Template = s"""

  // ========================= I T E R A B L E  ${RootClass}  F A C T O R Y =========================

  public static class ${RootClassFactoryName} implements Iterable<${RootClass}> {
    private final int size;
    private final boolean isDefaultSet;
    private final ${PropertyClass} defaultValue;

    public static ${RootClassFactoryName} make(final int size) {
      return new ${RootClassFactoryName}(size, false, ${PropertyDefaultValue});
    }

    private ${RootClassFactoryName}(final int size, final boolean isDefaultSet, final ${PropertyClass} defaultValue) {
      this.size = size;
      this.isDefaultSet = isDefaultSet;
      this.defaultValue = defaultValue;
    }

    public ${RootClassFactoryName} setDefaultValue(final ${PropertyClass} defaultValue) {
      return new ${RootClassFactoryName}(size, true, defaultValue);
    }

    public ${RootClassFactoryName} removeDefaultValue() {
      return isDefaultSet ? new ${RootClassFactoryName}(size, false, ${PropertyDefaultValue}) : this;
    }

    public ${RootClass}[] toArray() {
      final ${RootClass}[] roots = new ${RootClass}[size];
      for (int i = 0; i < size; i++) roots[i] = vendRoot();
      return roots;
    }

    @Override
    public Iterator<${RootClass}> iterator() {
      return new ${RootClassFactoryName}Iterator();
    }

    private ${RootClass} vendRoot() {
      final ${RootClass} root = new ${RootClass}();
      if (isDefaultSet) {
        root.set${PropertyName}(defaultValue);
      }
      return root;
    }

    public class ${RootClassFactoryName}Iterator implements Iterator<${RootClass}> {
      private int remaining = size;

      @Override
      public boolean hasNext() {
        return remaining > 0;
      }

      @Override
      public ${RootClass} next() {
        remaining--;
        return vendRoot();
      }

      @Override
      public void remove() {
      }
    }
  }"""
}
