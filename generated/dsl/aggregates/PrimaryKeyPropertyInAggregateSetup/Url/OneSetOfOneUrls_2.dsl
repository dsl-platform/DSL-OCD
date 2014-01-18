module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfOneUrls_2(oneSetOfOneUrls) {
    Set<Url> oneSetOfOneUrls;
  }
}
