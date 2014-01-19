module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneLongs_5 {
    List<Long>? nullableListOfOneLongs;
  }

  snowflake NullableListOfOneLongs_5Grid from NullableListOfOneLongs_5 {
    nullableListOfOneLongs;
  }
}
