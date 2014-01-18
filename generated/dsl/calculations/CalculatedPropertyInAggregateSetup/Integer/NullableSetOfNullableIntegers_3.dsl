module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableIntegers_3 {
    Set<Integer?>? nullableSetOfNullableIntegers;

    calculated Set<Integer?>? calculatedNullableSetOfNullableIntegers from 'it => it.nullableSetOfNullableIntegers';

    calculated Set<Integer?>? persistedNullableSetOfNullableIntegers from 'it => it.nullableSetOfNullableIntegers' { persisted; }
  }
}
