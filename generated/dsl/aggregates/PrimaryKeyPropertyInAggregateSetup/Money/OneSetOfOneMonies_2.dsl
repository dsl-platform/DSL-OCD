module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfOneMonies_2(oneSetOfOneMonies) {
    Set<Money> oneSetOfOneMonies;
  }
}
