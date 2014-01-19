module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableDoubles_5 {
    Set<Double?>? nullableSetOfNullableDoubles;
  }

  snowflake NullableSetOfNullableDoubles_5Grid from NullableSetOfNullableDoubles_5 {
    nullableSetOfNullableDoubles;
  }
}
