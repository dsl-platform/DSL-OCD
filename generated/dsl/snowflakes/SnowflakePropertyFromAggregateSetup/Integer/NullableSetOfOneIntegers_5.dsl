module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneIntegers_5 {
    Set<Integer>? nullableSetOfOneIntegers;
  }

  snowflake NullableSetOfOneIntegers_5Grid from NullableSetOfOneIntegers_5 {
    nullableSetOfOneIntegers;
  }
}
