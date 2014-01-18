module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneTimestamps_4 {
    Array<Timestamp> oneArrayOfOneTimestamps;

    calculated Array<Timestamp> calculatedOneArrayOfOneTimestamps from 'it => it.oneArrayOfOneTimestamps';

    calculated Array<Timestamp> persistedOneArrayOfOneTimestamps from 'it => it.oneArrayOfOneTimestamps' { persisted; }
  }
}
