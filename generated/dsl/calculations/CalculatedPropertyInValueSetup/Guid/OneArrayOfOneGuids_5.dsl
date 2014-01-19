module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneGuids_5 {
    Array<Guid> oneArrayOfOneGuids;

    calculated Array<Guid> calculatedOneArrayOfOneGuids from 'it => it.oneArrayOfOneGuids';

    calculated Array<Guid> persistedOneArrayOfOneGuids from 'it => it.oneArrayOfOneGuids' { persisted; }
  }
}
