module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableLongs_5 {
    List<Long?>? nullableListOfNullableLongs;
  }

  snowflake NullableListOfNullableLongs_5Grid from NullableListOfNullableLongs_5 {
    nullableListOfNullableLongs;
  }
}
