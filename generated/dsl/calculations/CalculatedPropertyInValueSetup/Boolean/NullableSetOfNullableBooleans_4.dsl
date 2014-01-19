module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableBooleans_4 {
    Set<Boolean?>? nullableSetOfNullableBooleans;

    calculated Set<Boolean?>? calculatedNullableSetOfNullableBooleans from 'it => it.nullableSetOfNullableBooleans';

    calculated Set<Boolean?>? persistedNullableSetOfNullableBooleans from 'it => it.nullableSetOfNullableBooleans' { persisted; }
  }
}
