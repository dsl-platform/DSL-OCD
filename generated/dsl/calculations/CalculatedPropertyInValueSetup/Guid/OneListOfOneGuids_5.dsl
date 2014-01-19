module CalculatedPropertyInValueSetup
{
  value OneListOfOneGuids_5 {
    List<Guid> oneListOfOneGuids;

    calculated List<Guid> calculatedOneListOfOneGuids from 'it => it.oneListOfOneGuids';

    calculated List<Guid> persistedOneListOfOneGuids from 'it => it.oneListOfOneGuids' { persisted; }
  }
}
