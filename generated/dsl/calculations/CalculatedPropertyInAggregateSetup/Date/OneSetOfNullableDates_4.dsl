module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableDates_4 {
    Set<Date?> oneSetOfNullableDates;

    calculated Set<Date?> calculatedOneSetOfNullableDates from 'it => it.oneSetOfNullableDates';

    calculated Set<Date?> persistedOneSetOfNullableDates from 'it => it.oneSetOfNullableDates' { persisted; }
  }
}
