module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableBooleans_4 {
    Array<Boolean?>? nullableArrayOfNullableBooleans;

    calculated Array<Boolean?>? calculatedNullableArrayOfNullableBooleans from 'it => it.nullableArrayOfNullableBooleans';

    calculated Array<Boolean?>? persistedNullableArrayOfNullableBooleans from 'it => it.nullableArrayOfNullableBooleans' { persisted; }
  }
}
