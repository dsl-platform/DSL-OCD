module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneBooleans_5 {
    Set<Boolean>? nullableSetOfOneBooleans;
  }

  snowflake NullableSetOfOneBooleans_5Grid from NullableSetOfOneBooleans_5 {
    nullableSetOfOneBooleans;
  }
}
