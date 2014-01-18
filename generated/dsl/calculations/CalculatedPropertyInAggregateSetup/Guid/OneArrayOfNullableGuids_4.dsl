module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableGuids_4 {
    Array<Guid?> oneArrayOfNullableGuids;

    calculated Array<Guid?> calculatedOneArrayOfNullableGuids from 'it => it.oneArrayOfNullableGuids';

    calculated Array<Guid?> persistedOneArrayOfNullableGuids from 'it => it.oneArrayOfNullableGuids' { persisted; }
  }
}
