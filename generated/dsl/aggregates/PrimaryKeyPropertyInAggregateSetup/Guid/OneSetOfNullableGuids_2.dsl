module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfNullableGuids_2(oneSetOfNullableGuids) {
    Set<Guid?> oneSetOfNullableGuids;
  }
}
