module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableTimestamps_2(oneArrayOfNullableTimestamps) {
    Array<Timestamp?> oneArrayOfNullableTimestamps;
  }
}
