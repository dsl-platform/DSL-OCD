module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneDates_4 {
    Array<Date> oneArrayOfOneDates;

    calculated Array<Date> calculatedOneArrayOfOneDates from 'it => it.oneArrayOfOneDates';

    calculated Array<Date> persistedOneArrayOfOneDates from 'it => it.oneArrayOfOneDates' { persisted; }
  }
}
