module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableIp_5 {
    Ip? nullableIp;
  }

  snowflake NullableIp_5Grid from NullableIp_5 {
    nullableIp;
  }
}
