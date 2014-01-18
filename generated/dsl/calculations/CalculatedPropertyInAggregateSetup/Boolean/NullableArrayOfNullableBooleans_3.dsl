module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableBooleans_3 {
    Array<Boolean?>? nullableArrayOfNullableBooleans;

    calculated Array<Boolean?>? calculatedNullableArrayOfNullableBooleans from 'it => it.nullableArrayOfNullableBooleans';

    calculated Array<Boolean?>? persistedNullableArrayOfNullableBooleans from 'it => it.nullableArrayOfNullableBooleans' { persisted; }
  }
}
