module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneDates_4 {
    List<Date> oneListOfOneDates;

    calculated List<Date> calculatedOneListOfOneDates from 'it => it.oneListOfOneDates';

    calculated List<Date> persistedOneListOfOneDates from 'it => it.oneListOfOneDates' { persisted; }
  }
}
