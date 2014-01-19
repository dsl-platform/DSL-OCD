module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneLongs_5 {
    Set<Long>? nullableSetOfOneLongs;
  }

  snowflake NullableSetOfOneLongs_5Grid from NullableSetOfOneLongs_5 {
    nullableSetOfOneLongs;
  }
}
