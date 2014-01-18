module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfNullableDates_2(oneSetOfNullableDates) {
    Set<Date?> oneSetOfNullableDates;
  }
}
