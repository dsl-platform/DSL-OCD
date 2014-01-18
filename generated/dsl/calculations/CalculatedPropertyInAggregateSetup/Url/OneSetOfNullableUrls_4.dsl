module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableUrls_4 {
    Set<Url?> oneSetOfNullableUrls;

    calculated Set<Url?> calculatedOneSetOfNullableUrls from 'it => it.oneSetOfNullableUrls';

    calculated Set<Url?> persistedOneSetOfNullableUrls from 'it => it.oneSetOfNullableUrls' { persisted; }
  }
}
