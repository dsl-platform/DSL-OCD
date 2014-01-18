module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableIps_2(oneArrayOfNullableIps) {
    Array<Ip?> oneArrayOfNullableIps;
  }
}
