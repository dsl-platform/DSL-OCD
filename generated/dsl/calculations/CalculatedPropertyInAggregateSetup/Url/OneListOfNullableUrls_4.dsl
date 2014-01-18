module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableUrls_4 {
    List<Url?> oneListOfNullableUrls;

    calculated List<Url?> calculatedOneListOfNullableUrls from 'it => it.oneListOfNullableUrls';

    calculated List<Url?> persistedOneListOfNullableUrls from 'it => it.oneListOfNullableUrls' { persisted; }
  }
}
