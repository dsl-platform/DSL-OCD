module CalculatedPropertyInValueSetup
{
  value OneListOfNullableGuids_5 {
    List<Guid?> oneListOfNullableGuids;

    calculated List<Guid?> calculatedOneListOfNullableGuids from 'it => it.oneListOfNullableGuids';

    calculated List<Guid?> persistedOneListOfNullableGuids from 'it => it.oneListOfNullableGuids' { persisted; }
  }
}
