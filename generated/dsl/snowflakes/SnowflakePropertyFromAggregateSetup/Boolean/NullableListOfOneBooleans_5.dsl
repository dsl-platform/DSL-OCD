module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneBooleans_5 {
    List<Boolean>? nullableListOfOneBooleans;
  }

  snowflake NullableListOfOneBooleans_5Grid from NullableListOfOneBooleans_5 {
    nullableListOfOneBooleans;
  }
}
