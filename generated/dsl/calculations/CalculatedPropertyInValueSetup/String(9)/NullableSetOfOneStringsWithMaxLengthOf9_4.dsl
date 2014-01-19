module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneStringsWithMaxLengthOf9_4 {
    Set<String(9)>? nullableSetOfOneStringsWithMaxLengthOf9;

    calculated Set<String(9)>? calculatedNullableSetOfOneStringsWithMaxLengthOf9 from 'it => it.nullableSetOfOneStringsWithMaxLengthOf9';

    calculated Set<String(9)>? persistedNullableSetOfOneStringsWithMaxLengthOf9 from 'it => it.nullableSetOfOneStringsWithMaxLengthOf9' { persisted; }
  }
}
