module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableIps_6 {
    Set<Ip?> oneSetOfNullableIps;
  }

  snowflake OneSetOfNullableIps_6Grid from OneSetOfNullableIps_6 {
    oneSetOfNullableIps;
  }
}
