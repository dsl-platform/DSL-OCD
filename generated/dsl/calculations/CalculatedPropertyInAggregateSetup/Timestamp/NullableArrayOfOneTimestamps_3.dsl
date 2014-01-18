module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneTimestamps_3 {
    Array<Timestamp>? nullableArrayOfOneTimestamps;

    calculated Array<Timestamp>? calculatedNullableArrayOfOneTimestamps from 'it => it.nullableArrayOfOneTimestamps';

    calculated Array<Timestamp>? persistedNullableArrayOfOneTimestamps from 'it => it.nullableArrayOfOneTimestamps' { persisted; }
  }
}
