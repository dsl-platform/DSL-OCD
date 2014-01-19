module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableStringsWithMaxLengthOf9_4 {
    List<String(9)?>? nullableListOfNullableStringsWithMaxLengthOf9;

    calculated List<String(9)?>? calculatedNullableListOfNullableStringsWithMaxLengthOf9 from 'it => it.nullableListOfNullableStringsWithMaxLengthOf9';

    calculated List<String(9)?>? persistedNullableListOfNullableStringsWithMaxLengthOf9 from 'it => it.nullableListOfNullableStringsWithMaxLengthOf9' { persisted; }
  }
}