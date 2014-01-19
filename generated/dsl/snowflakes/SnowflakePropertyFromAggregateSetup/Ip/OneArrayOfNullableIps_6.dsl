module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableIps_6 {
    Array<Ip?> oneArrayOfNullableIps;
  }

  snowflake OneArrayOfNullableIps_6Grid from OneArrayOfNullableIps_6 {
    oneArrayOfNullableIps;
  }
}
