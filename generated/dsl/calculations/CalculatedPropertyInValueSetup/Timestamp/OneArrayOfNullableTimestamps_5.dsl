module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableTimestamps_5 {
    Array<Timestamp?> oneArrayOfNullableTimestamps;

    calculated Array<Timestamp?> calculatedOneArrayOfNullableTimestamps from 'it => it.oneArrayOfNullableTimestamps';

    calculated Array<Timestamp?> persistedOneArrayOfNullableTimestamps from 'it => it.oneArrayOfNullableTimestamps' { persisted; }
  }
}
