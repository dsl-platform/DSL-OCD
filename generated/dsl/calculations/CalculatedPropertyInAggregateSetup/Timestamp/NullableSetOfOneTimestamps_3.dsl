module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneTimestamps_3 {
    Set<Timestamp>? nullableSetOfOneTimestamps;

    calculated Set<Timestamp>? calculatedNullableSetOfOneTimestamps from 'it => it.nullableSetOfOneTimestamps';

    calculated Set<Timestamp>? persistedNullableSetOfOneTimestamps from 'it => it.nullableSetOfOneTimestamps' { persisted; }
  }
}
