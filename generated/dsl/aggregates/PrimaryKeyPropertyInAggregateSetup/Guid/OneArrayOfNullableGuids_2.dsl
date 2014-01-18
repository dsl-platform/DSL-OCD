module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableGuids_2(oneArrayOfNullableGuids) {
    Array<Guid?> oneArrayOfNullableGuids;
  }
}
