module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableTimestamps_4 {
    List<Timestamp?> oneListOfNullableTimestamps;

    calculated List<Timestamp?> calculatedOneListOfNullableTimestamps from 'it => it.oneListOfNullableTimestamps';

    calculated List<Timestamp?> persistedOneListOfNullableTimestamps from 'it => it.oneListOfNullableTimestamps' { persisted; }
  }
}
