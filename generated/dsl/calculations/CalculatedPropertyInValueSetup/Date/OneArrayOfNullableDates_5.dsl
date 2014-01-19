module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableDates_5 {
    Array<Date?> oneArrayOfNullableDates;

    calculated Array<Date?> calculatedOneArrayOfNullableDates from 'it => it.oneArrayOfNullableDates';

    calculated Array<Date?> persistedOneArrayOfNullableDates from 'it => it.oneArrayOfNullableDates' { persisted; }
  }
}
