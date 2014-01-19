module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableTimestamps_4 {
    Array<Timestamp?>? nullableArrayOfNullableTimestamps;

    calculated Array<Timestamp?>? calculatedNullableArrayOfNullableTimestamps from 'it => it.nullableArrayOfNullableTimestamps';

    calculated Array<Timestamp?>? persistedNullableArrayOfNullableTimestamps from 'it => it.nullableArrayOfNullableTimestamps' { persisted; }
  }
}
