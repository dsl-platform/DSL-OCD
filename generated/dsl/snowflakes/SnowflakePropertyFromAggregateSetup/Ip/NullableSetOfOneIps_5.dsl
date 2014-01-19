module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneIps_5 {
    Set<Ip>? nullableSetOfOneIps;
  }

  snowflake NullableSetOfOneIps_5Grid from NullableSetOfOneIps_5 {
    nullableSetOfOneIps;
  }
}
