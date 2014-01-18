module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneStringsWithMaxLengthOf9_3 {
    Array<String(9)>? nullableArrayOfOneStringsWithMaxLengthOf9;

    calculated Array<String(9)>? calculatedNullableArrayOfOneStringsWithMaxLengthOf9 from 'it => it.nullableArrayOfOneStringsWithMaxLengthOf9';

    calculated Array<String(9)>? persistedNullableArrayOfOneStringsWithMaxLengthOf9 from 'it => it.nullableArrayOfOneStringsWithMaxLengthOf9' { persisted; }
  }
}
