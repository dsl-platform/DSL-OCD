module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneTimestamps_5 {
    Array<Timestamp> oneArrayOfOneTimestamps;

    calculated Array<Timestamp> calculatedOneArrayOfOneTimestamps from 'it => it.oneArrayOfOneTimestamps';

    calculated Array<Timestamp> persistedOneArrayOfOneTimestamps from 'it => it.oneArrayOfOneTimestamps' { persisted; }
  }
}
