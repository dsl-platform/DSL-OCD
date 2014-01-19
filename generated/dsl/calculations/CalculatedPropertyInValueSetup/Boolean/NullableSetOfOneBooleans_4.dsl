module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneBooleans_4 {
    Set<Boolean>? nullableSetOfOneBooleans;

    calculated Set<Boolean>? calculatedNullableSetOfOneBooleans from 'it => it.nullableSetOfOneBooleans';

    calculated Set<Boolean>? persistedNullableSetOfOneBooleans from 'it => it.nullableSetOfOneBooleans' { persisted; }
  }
}
