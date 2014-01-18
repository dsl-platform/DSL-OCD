module SurrogatePrimaryKeyWithOnePropertyInAggregate
{
  aggregate NullableSetOfOneStringsWithMaxLengthOf9_2 {
    Set<String(9)>? nullableSetOfOneStringsWithMaxLengthOf9;
  }
}
