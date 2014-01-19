module CalculatedPropertyInValueSetup
{
  value OneListOfNullableDates_5 {
    List<Date?> oneListOfNullableDates;

    calculated List<Date?> calculatedOneListOfNullableDates from 'it => it.oneListOfNullableDates';

    calculated List<Date?> persistedOneListOfNullableDates from 'it => it.oneListOfNullableDates' { persisted; }
  }
}
