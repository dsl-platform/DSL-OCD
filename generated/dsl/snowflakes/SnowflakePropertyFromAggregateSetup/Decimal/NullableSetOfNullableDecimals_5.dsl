module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableDecimals_5 {
    Set<Decimal?>? nullableSetOfNullableDecimals;
  }

  snowflake NullableSetOfNullableDecimals_5Grid from NullableSetOfNullableDecimals_5 {
    nullableSetOfNullableDecimals;
  }
}
