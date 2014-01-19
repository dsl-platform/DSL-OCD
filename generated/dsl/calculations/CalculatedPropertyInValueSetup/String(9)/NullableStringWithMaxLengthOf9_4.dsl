module CalculatedPropertyInValueSetup
{
  value NullableStringWithMaxLengthOf9_4 {
    String(9)? nullableStringWithMaxLengthOf9;

    calculated String(9)? calculatedNullableStringWithMaxLengthOf9 from 'it => it.nullableStringWithMaxLengthOf9';

    calculated String(9)? persistedNullableStringWithMaxLengthOf9 from 'it => it.nullableStringWithMaxLengthOf9' { persisted; }
  }
}
