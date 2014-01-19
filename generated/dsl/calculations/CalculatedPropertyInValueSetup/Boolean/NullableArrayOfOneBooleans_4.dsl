module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneBooleans_4 {
    Array<Boolean>? nullableArrayOfOneBooleans;

    calculated Array<Boolean>? calculatedNullableArrayOfOneBooleans from 'it => it.nullableArrayOfOneBooleans';

    calculated Array<Boolean>? persistedNullableArrayOfOneBooleans from 'it => it.nullableArrayOfOneBooleans' { persisted; }
  }
}
