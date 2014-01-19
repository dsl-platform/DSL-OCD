module CalculatedPropertyInValueSetup
{
  value NullableListOfOneStringsWithMaxLengthOf9_4 {
    List<String(9)>? nullableListOfOneStringsWithMaxLengthOf9;

    calculated List<String(9)>? calculatedNullableListOfOneStringsWithMaxLengthOf9 from 'it => it.nullableListOfOneStringsWithMaxLengthOf9';

    calculated List<String(9)>? persistedNullableListOfOneStringsWithMaxLengthOf9 from 'it => it.nullableListOfOneStringsWithMaxLengthOf9' { persisted; }
  }
}
