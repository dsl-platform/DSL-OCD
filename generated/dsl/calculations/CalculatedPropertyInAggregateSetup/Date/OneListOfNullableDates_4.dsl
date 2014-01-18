module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableDates_4 {
    List<Date?> oneListOfNullableDates;

    calculated List<Date?> calculatedOneListOfNullableDates from 'it => it.oneListOfNullableDates';

    calculated List<Date?> persistedOneListOfNullableDates from 'it => it.oneListOfNullableDates' { persisted; }
  }
}
