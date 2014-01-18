module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneGuids_4 {
    Array<Guid> oneArrayOfOneGuids;

    calculated Array<Guid> calculatedOneArrayOfOneGuids from 'it => it.oneArrayOfOneGuids';

    calculated Array<Guid> persistedOneArrayOfOneGuids from 'it => it.oneArrayOfOneGuids' { persisted; }
  }
}
