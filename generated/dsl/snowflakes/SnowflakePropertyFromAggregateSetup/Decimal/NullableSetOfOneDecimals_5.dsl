module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneDecimals_5 {
    Set<Decimal>? nullableSetOfOneDecimals;
  }

  snowflake NullableSetOfOneDecimals_5Grid from NullableSetOfOneDecimals_5 {
    nullableSetOfOneDecimals;
  }
}
