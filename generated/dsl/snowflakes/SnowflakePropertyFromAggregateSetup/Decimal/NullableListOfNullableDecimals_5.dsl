module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableDecimals_5 {
    List<Decimal?>? nullableListOfNullableDecimals;
  }

  snowflake NullableListOfNullableDecimals_5Grid from NullableListOfNullableDecimals_5 {
    nullableListOfNullableDecimals;
  }
}
