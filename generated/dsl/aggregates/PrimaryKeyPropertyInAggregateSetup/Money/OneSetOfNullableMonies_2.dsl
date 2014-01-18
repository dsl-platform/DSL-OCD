module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfNullableMonies_2(oneSetOfNullableMonies) {
    Set<Money?> oneSetOfNullableMonies;
  }
}
