module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableTimestamps_4 {
    Array<Timestamp?> oneArrayOfNullableTimestamps;

    calculated Array<Timestamp?> calculatedOneArrayOfNullableTimestamps from 'it => it.oneArrayOfNullableTimestamps';

    calculated Array<Timestamp?> persistedOneArrayOfNullableTimestamps from 'it => it.oneArrayOfNullableTimestamps' { persisted; }
  }
}
