module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableIps_5 {
    Array<Ip?>? nullableArrayOfNullableIps;
  }

  snowflake NullableArrayOfNullableIps_5Grid from NullableArrayOfNullableIps_5 {
    nullableArrayOfNullableIps;
  }
}
