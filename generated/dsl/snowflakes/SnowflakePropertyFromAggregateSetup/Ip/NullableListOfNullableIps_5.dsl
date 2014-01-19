module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableIps_5 {
    List<Ip?>? nullableListOfNullableIps;
  }

  snowflake NullableListOfNullableIps_5Grid from NullableListOfNullableIps_5 {
    nullableListOfNullableIps;
  }
}
