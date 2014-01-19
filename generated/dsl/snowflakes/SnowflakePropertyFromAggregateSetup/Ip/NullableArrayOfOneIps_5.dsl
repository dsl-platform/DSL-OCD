module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneIps_5 {
    Array<Ip>? nullableArrayOfOneIps;
  }

  snowflake NullableArrayOfOneIps_5Grid from NullableArrayOfOneIps_5 {
    nullableArrayOfOneIps;
  }
}
