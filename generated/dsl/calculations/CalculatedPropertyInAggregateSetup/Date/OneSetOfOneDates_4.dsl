module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneDates_4 {
    Set<Date> oneSetOfOneDates;

    calculated Set<Date> calculatedOneSetOfOneDates from 'it => it.oneSetOfOneDates';

    calculated Set<Date> persistedOneSetOfOneDates from 'it => it.oneSetOfOneDates' { persisted; }
  }
}
