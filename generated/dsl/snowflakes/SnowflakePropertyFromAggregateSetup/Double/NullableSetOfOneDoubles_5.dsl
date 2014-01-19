module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneDoubles_5 {
    Set<Double>? nullableSetOfOneDoubles;
  }

  snowflake NullableSetOfOneDoubles_5Grid from NullableSetOfOneDoubles_5 {
    nullableSetOfOneDoubles;
  }
}
