module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableTimestamps_3 {
    List<Timestamp?>? nullableListOfNullableTimestamps;

    calculated List<Timestamp?>? calculatedNullableListOfNullableTimestamps from 'it => it.nullableListOfNullableTimestamps';

    calculated List<Timestamp?>? persistedNullableListOfNullableTimestamps from 'it => it.nullableListOfNullableTimestamps' { persisted; }
  }
}
