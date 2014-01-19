module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneStrings_4 {
    Array<String>? nullableArrayOfOneStrings;

    calculated Array<String>? calculatedNullableArrayOfOneStrings from 'it => it.nullableArrayOfOneStrings';

    calculated Array<String>? persistedNullableArrayOfOneStrings from 'it => it.nullableArrayOfOneStrings' { persisted; }
  }
}
