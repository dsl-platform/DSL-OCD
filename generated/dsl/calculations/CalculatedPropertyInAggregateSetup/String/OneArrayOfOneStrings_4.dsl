module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneStrings_4 {
    Array<String> oneArrayOfOneStrings;

    calculated Array<String> calculatedOneArrayOfOneStrings from 'it => it.oneArrayOfOneStrings';

    calculated Array<String> persistedOneArrayOfOneStrings from 'it => it.oneArrayOfOneStrings' { persisted; }
  }
}
