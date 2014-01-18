module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableUrls_4 {
    Array<Url?> oneArrayOfNullableUrls;

    calculated Array<Url?> calculatedOneArrayOfNullableUrls from 'it => it.oneArrayOfNullableUrls';

    calculated Array<Url?> persistedOneArrayOfNullableUrls from 'it => it.oneArrayOfNullableUrls' { persisted; }
  }
}
