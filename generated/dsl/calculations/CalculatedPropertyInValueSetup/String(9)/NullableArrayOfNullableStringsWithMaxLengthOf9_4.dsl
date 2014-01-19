module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableStringsWithMaxLengthOf9_4 {
    Array<String(9)?>? nullableArrayOfNullableStringsWithMaxLengthOf9;

    calculated Array<String(9)?>? calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 from 'it => it.nullableArrayOfNullableStringsWithMaxLengthOf9';

    calculated Array<String(9)?>? persistedNullableArrayOfNullableStringsWithMaxLengthOf9 from 'it => it.nullableArrayOfNullableStringsWithMaxLengthOf9' { persisted; }
  }
}
