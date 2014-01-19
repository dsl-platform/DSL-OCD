module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneDecimals_5 {
    List<Decimal>? nullableListOfOneDecimals;
  }

  snowflake NullableListOfOneDecimals_5Grid from NullableListOfOneDecimals_5 {
    nullableListOfOneDecimals;
  }
}
