module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneStrings_4 {
    List<String> oneListOfOneStrings;

    calculated List<String> calculatedOneListOfOneStrings from 'it => it.oneListOfOneStrings';

    calculated List<String> persistedOneListOfOneStrings from 'it => it.oneListOfOneStrings' { persisted; }
  }
}
