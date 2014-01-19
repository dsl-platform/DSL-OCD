module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableMonies_4 {
    Array<Money?>? nullableArrayOfNullableMonies;

    calculated Array<Money?>? calculatedNullableArrayOfNullableMonies from 'it => it.nullableArrayOfNullableMonies';

    calculated Array<Money?>? persistedNullableArrayOfNullableMonies from 'it => it.nullableArrayOfNullableMonies' { persisted; }
  }
}
