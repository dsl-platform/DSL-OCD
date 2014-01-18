module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableTimestamps_4 {
    Set<Timestamp?> oneSetOfNullableTimestamps;

    calculated Set<Timestamp?> calculatedOneSetOfNullableTimestamps from 'it => it.oneSetOfNullableTimestamps';

    calculated Set<Timestamp?> persistedOneSetOfNullableTimestamps from 'it => it.oneSetOfNullableTimestamps' { persisted; }
  }
}
