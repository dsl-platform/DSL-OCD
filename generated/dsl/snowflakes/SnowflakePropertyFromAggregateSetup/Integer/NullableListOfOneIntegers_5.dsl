module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneIntegers_5 {
    List<Integer>? nullableListOfOneIntegers;
  }

  snowflake NullableListOfOneIntegers_5Grid from NullableListOfOneIntegers_5 {
    nullableListOfOneIntegers;
  }
}
