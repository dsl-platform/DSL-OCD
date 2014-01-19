module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneIps_5 {
    List<Ip>? nullableListOfOneIps;
  }

  snowflake NullableListOfOneIps_5Grid from NullableListOfOneIps_5 {
    nullableListOfOneIps;
  }
}
