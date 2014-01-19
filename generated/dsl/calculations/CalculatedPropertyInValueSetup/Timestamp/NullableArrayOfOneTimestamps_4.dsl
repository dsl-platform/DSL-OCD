module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneTimestamps_4 {
    Array<Timestamp>? nullableArrayOfOneTimestamps;

    calculated Array<Timestamp>? calculatedNullableArrayOfOneTimestamps from 'it => it.nullableArrayOfOneTimestamps';

    calculated Array<Timestamp>? persistedNullableArrayOfOneTimestamps from 'it => it.nullableArrayOfOneTimestamps' { persisted; }
  }
}
