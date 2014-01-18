module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfNullableUrls_2(oneSetOfNullableUrls) {
    Set<Url?> oneSetOfNullableUrls;
  }
}
