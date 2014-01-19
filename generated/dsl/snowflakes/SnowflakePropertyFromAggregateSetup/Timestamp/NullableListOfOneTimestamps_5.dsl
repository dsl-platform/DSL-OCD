module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneTimestamps_5 {
    List<Timestamp>? nullableListOfOneTimestamps;
  }

  snowflake NullableListOfOneTimestamps_5Grid from NullableListOfOneTimestamps_5 {
    nullableListOfOneTimestamps;
  }
}
