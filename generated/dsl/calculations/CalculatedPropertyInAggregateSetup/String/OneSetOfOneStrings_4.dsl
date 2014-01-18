module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneStrings_4 {
    Set<String> oneSetOfOneStrings;

    calculated Set<String> calculatedOneSetOfOneStrings from 'it => it.oneSetOfOneStrings';

    calculated Set<String> persistedOneSetOfOneStrings from 'it => it.oneSetOfOneStrings' { persisted; }
  }
}
