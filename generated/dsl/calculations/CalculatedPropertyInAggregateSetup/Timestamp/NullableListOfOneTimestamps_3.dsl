module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneTimestamps_3 {
    List<Timestamp>? nullableListOfOneTimestamps;

    calculated List<Timestamp>? calculatedNullableListOfOneTimestamps from 'it => it.nullableListOfOneTimestamps';

    calculated List<Timestamp>? persistedNullableListOfOneTimestamps from 'it => it.nullableListOfOneTimestamps' { persisted; }
  }
}
