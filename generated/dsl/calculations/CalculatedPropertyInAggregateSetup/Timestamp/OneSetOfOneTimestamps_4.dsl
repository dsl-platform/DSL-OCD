module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneTimestamps_4 {
    Set<Timestamp> oneSetOfOneTimestamps;

    calculated Set<Timestamp> calculatedOneSetOfOneTimestamps from 'it => it.oneSetOfOneTimestamps';

    calculated Set<Timestamp> persistedOneSetOfOneTimestamps from 'it => it.oneSetOfOneTimestamps' { persisted; }
  }
}
