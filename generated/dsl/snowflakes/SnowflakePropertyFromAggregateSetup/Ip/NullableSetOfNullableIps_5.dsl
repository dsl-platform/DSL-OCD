module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableIps_5 {
    Set<Ip?>? nullableSetOfNullableIps;
  }

  snowflake NullableSetOfNullableIps_5Grid from NullableSetOfNullableIps_5 {
    nullableSetOfNullableIps;
  }
}
