module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneTimestamps_5 {
    Set<Timestamp>? nullableSetOfOneTimestamps;
  }

  snowflake NullableSetOfOneTimestamps_5Grid from NullableSetOfOneTimestamps_5 {
    nullableSetOfOneTimestamps;
  }
}
