module CalculatedPropertyInAggregateSetup
{
  aggregate NullableStringWithMaxLengthOf9_3 {
    String(9)? nullableStringWithMaxLengthOf9;

    calculated String(9)? calculatedNullableStringWithMaxLengthOf9 from 'it => it.nullableStringWithMaxLengthOf9';

    calculated String(9)? persistedNullableStringWithMaxLengthOf9 from 'it => it.nullableStringWithMaxLengthOf9' { persisted; }
  }
}
