module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableIntegers_5 {
    Array<Integer?> oneArrayOfNullableIntegers;

    calculated Array<Integer?> calculatedOneArrayOfNullableIntegers from 'it => it.oneArrayOfNullableIntegers';

    calculated Array<Integer?> persistedOneArrayOfNullableIntegers from 'it => it.oneArrayOfNullableIntegers' { persisted; }
  }
}
