module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableBooleans_5 {
    Set<Boolean?>? nullableSetOfNullableBooleans;
  }

  snowflake NullableSetOfNullableBooleans_5Grid from NullableSetOfNullableBooleans_5 {
    nullableSetOfNullableBooleans;
  }
}
