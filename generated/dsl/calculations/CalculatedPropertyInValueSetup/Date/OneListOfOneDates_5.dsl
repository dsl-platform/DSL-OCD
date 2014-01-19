module CalculatedPropertyInValueSetup
{
  value OneListOfOneDates_5 {
    List<Date> oneListOfOneDates;

    calculated List<Date> calculatedOneListOfOneDates from 'it => it.oneListOfOneDates';

    calculated List<Date> persistedOneListOfOneDates from 'it => it.oneListOfOneDates' { persisted; }
  }
}
