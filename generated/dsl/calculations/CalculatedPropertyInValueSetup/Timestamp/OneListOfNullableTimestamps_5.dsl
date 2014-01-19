module CalculatedPropertyInValueSetup
{
  value OneListOfNullableTimestamps_5 {
    List<Timestamp?> oneListOfNullableTimestamps;

    calculated List<Timestamp?> calculatedOneListOfNullableTimestamps from 'it => it.oneListOfNullableTimestamps';

    calculated List<Timestamp?> persistedOneListOfNullableTimestamps from 'it => it.oneListOfNullableTimestamps' { persisted; }
  }
}
