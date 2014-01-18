module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneGuids_4 {
    List<Guid> oneListOfOneGuids;

    calculated List<Guid> calculatedOneListOfOneGuids from 'it => it.oneListOfOneGuids';

    calculated List<Guid> persistedOneListOfOneGuids from 'it => it.oneListOfOneGuids' { persisted; }
  }
}
