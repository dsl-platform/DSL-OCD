module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneLongs_4 {
    Set<Long> oneSetOfOneLongs;

    calculated Set<Long> calculatedOneSetOfOneLongs from 'it => it.oneSetOfOneLongs';

    calculated Set<Long> persistedOneSetOfOneLongs from 'it => it.oneSetOfOneLongs' { persisted; }
  }
}
