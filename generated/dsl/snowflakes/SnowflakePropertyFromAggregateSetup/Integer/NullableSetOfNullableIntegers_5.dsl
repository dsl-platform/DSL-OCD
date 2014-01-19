module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableIntegers_5 {
    Set<Integer?>? nullableSetOfNullableIntegers;
  }

  snowflake NullableSetOfNullableIntegers_5Grid from NullableSetOfNullableIntegers_5 {
    nullableSetOfNullableIntegers;
  }
}
