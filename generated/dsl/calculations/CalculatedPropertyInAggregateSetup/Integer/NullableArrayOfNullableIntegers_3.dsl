module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableIntegers_3 {
    Array<Integer?>? nullableArrayOfNullableIntegers;

    calculated Array<Integer?>? calculatedNullableArrayOfNullableIntegers from 'it => it.nullableArrayOfNullableIntegers';

    calculated Array<Integer?>? persistedNullableArrayOfNullableIntegers from 'it => it.nullableArrayOfNullableIntegers' { persisted; }
  }
}
