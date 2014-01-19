module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableDoubles_4 {
    Array<Double?>? nullableArrayOfNullableDoubles;

    calculated Array<Double?>? calculatedNullableArrayOfNullableDoubles from 'it => it.nullableArrayOfNullableDoubles';

    calculated Array<Double?>? persistedNullableArrayOfNullableDoubles from 'it => it.nullableArrayOfNullableDoubles' { persisted; }
  }
}
