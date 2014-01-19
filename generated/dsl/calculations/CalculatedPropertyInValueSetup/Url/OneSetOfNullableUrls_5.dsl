module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableUrls_5 {
    Set<Url?> oneSetOfNullableUrls;

    calculated Set<Url?> calculatedOneSetOfNullableUrls from 'it => it.oneSetOfNullableUrls';

    calculated Set<Url?> persistedOneSetOfNullableUrls from 'it => it.oneSetOfNullableUrls' { persisted; }
  }
}
