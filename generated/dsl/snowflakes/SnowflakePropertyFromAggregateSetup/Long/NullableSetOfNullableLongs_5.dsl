module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableLongs_5 {
    Set<Long?>? nullableSetOfNullableLongs;
  }

  snowflake NullableSetOfNullableLongs_5Grid from NullableSetOfNullableLongs_5 {
    nullableSetOfNullableLongs;
  }
}
