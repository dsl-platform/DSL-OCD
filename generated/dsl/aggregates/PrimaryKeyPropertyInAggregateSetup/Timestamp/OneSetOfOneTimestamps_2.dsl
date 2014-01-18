module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfOneTimestamps_2(oneSetOfOneTimestamps) {
    Set<Timestamp> oneSetOfOneTimestamps;
  }
}
