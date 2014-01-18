module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableGuids_4 {
    Set<Guid?> oneSetOfNullableGuids;

    calculated Set<Guid?> calculatedOneSetOfNullableGuids from 'it => it.oneSetOfNullableGuids';

    calculated Set<Guid?> persistedOneSetOfNullableGuids from 'it => it.oneSetOfNullableGuids' { persisted; }
  }
}
