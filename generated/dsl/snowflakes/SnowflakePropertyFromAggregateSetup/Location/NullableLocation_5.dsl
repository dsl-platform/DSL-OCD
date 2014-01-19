module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableLocation_5 {
    Location? nullableLocation;
  }

  snowflake NullableLocation_5Grid from NullableLocation_5 {
    nullableLocation;
  }
}
