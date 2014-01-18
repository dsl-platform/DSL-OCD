module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneIntegers_3 {
    Array<Integer>? nullableArrayOfOneIntegers;

    calculated Array<Integer>? calculatedNullableArrayOfOneIntegers from 'it => it.nullableArrayOfOneIntegers';

    calculated Array<Integer>? persistedNullableArrayOfOneIntegers from 'it => it.nullableArrayOfOneIntegers' { persisted; }
  }
}
