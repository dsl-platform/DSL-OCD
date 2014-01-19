module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableIntegers_5 {
    List<Integer?>? nullableListOfNullableIntegers;
  }

  snowflake NullableListOfNullableIntegers_5Grid from NullableListOfNullableIntegers_5 {
    nullableListOfNullableIntegers;
  }
}
