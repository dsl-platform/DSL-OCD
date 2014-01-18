module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableStringsWithMaxLengthOf9_3 {
    Set<String(9)?>? nullableSetOfNullableStringsWithMaxLengthOf9;

    calculated Set<String(9)?>? calculatedNullableSetOfNullableStringsWithMaxLengthOf9 from 'it => it.nullableSetOfNullableStringsWithMaxLengthOf9';

    calculated Set<String(9)?>? persistedNullableSetOfNullableStringsWithMaxLengthOf9 from 'it => it.nullableSetOfNullableStringsWithMaxLengthOf9' { persisted; }
  }
}
