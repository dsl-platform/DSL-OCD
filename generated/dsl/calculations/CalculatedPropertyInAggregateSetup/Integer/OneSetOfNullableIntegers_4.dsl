module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableIntegers_4 {
    Set<Integer?> oneSetOfNullableIntegers;

    calculated Set<Integer?> calculatedOneSetOfNullableIntegers from 'it => it.oneSetOfNullableIntegers';

    calculated Set<Integer?> persistedOneSetOfNullableIntegers from 'it => it.oneSetOfNullableIntegers' { persisted; }
  }
}
