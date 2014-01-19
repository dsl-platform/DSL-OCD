module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableDecimals_6 {
    Array<Decimal?> oneArrayOfNullableDecimals;
  }

  snowflake OneArrayOfNullableDecimals_6Grid from OneArrayOfNullableDecimals_6 {
    oneArrayOfNullableDecimals;
  }
}
