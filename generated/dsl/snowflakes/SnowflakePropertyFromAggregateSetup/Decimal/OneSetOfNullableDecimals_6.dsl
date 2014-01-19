module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableDecimals_6 {
    Set<Decimal?> oneSetOfNullableDecimals;
  }

  snowflake OneSetOfNullableDecimals_6Grid from OneSetOfNullableDecimals_6 {
    oneSetOfNullableDecimals;
  }
}
