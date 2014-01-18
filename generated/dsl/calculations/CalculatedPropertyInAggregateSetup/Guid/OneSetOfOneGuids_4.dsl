module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneGuids_4 {
    Set<Guid> oneSetOfOneGuids;

    calculated Set<Guid> calculatedOneSetOfOneGuids from 'it => it.oneSetOfOneGuids';

    calculated Set<Guid> persistedOneSetOfOneGuids from 'it => it.oneSetOfOneGuids' { persisted; }
  }
}
