module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableIntegers_5 {
    Set<Integer?> oneSetOfNullableIntegers;

    calculated Set<Integer?> calculatedOneSetOfNullableIntegers from 'it => it.oneSetOfNullableIntegers';

    calculated Set<Integer?> persistedOneSetOfNullableIntegers from 'it => it.oneSetOfNullableIntegers' { persisted; }
  }
}
