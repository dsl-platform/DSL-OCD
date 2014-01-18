module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableStringsWithMaxLengthOf9_3 {
    Array<String(9)?>? nullableArrayOfNullableStringsWithMaxLengthOf9;

    calculated Array<String(9)?>? calculatedNullableArrayOfNullableStringsWithMaxLengthOf9 from 'it => it.nullableArrayOfNullableStringsWithMaxLengthOf9';

    calculated Array<String(9)?>? persistedNullableArrayOfNullableStringsWithMaxLengthOf9 from 'it => it.nullableArrayOfNullableStringsWithMaxLengthOf9' { persisted; }
  }
}
