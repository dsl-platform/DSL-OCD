module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfNullableIps_2(oneSetOfNullableIps) {
    Set<Ip?> oneSetOfNullableIps;
  }
}
