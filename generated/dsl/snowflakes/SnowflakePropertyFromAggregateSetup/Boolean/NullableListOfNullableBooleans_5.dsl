module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableBooleans_5 {
    List<Boolean?>? nullableListOfNullableBooleans;
  }

  snowflake NullableListOfNullableBooleans_5Grid from NullableListOfNullableBooleans_5 {
    nullableListOfNullableBooleans;
  }
}
