module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfOneGuids_2(oneSetOfOneGuids) {
    Set<Guid> oneSetOfOneGuids;
  }
}
