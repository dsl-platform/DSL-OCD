module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableIntegers_4 {
    Array<Integer?> oneArrayOfNullableIntegers;

    calculated Array<Integer?> calculatedOneArrayOfNullableIntegers from 'it => it.oneArrayOfNullableIntegers';

    calculated Array<Integer?> persistedOneArrayOfNullableIntegers from 'it => it.oneArrayOfNullableIntegers' { persisted; }
  }
}
