module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableLongs_4 {
    Set<Long?> oneSetOfNullableLongs;

    calculated Set<Long?> calculatedOneSetOfNullableLongs from 'it => it.oneSetOfNullableLongs';

    calculated Set<Long?> persistedOneSetOfNullableLongs from 'it => it.oneSetOfNullableLongs' { persisted; }
  }
}
