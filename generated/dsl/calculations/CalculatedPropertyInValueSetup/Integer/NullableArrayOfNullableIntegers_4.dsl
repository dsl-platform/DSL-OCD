module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableIntegers_4 {
    Array<Integer?>? nullableArrayOfNullableIntegers;

    calculated Array<Integer?>? calculatedNullableArrayOfNullableIntegers from 'it => it.nullableArrayOfNullableIntegers';

    calculated Array<Integer?>? persistedNullableArrayOfNullableIntegers from 'it => it.nullableArrayOfNullableIntegers' { persisted; }
  }
}
