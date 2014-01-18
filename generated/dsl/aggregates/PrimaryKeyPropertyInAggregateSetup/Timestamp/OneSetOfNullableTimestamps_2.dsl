module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfNullableTimestamps_2(oneSetOfNullableTimestamps) {
    Set<Timestamp?> oneSetOfNullableTimestamps;
  }
}
