module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableIps_6 {
    List<Ip?> oneListOfNullableIps;
  }

  snowflake OneListOfNullableIps_6Grid from OneListOfNullableIps_6 {
    oneListOfNullableIps;
  }
}
