module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableDecimals_6 {
    List<Decimal?> oneListOfNullableDecimals;
  }

  snowflake OneListOfNullableDecimals_6Grid from OneListOfNullableDecimals_6 {
    oneListOfNullableDecimals;
  }
}
