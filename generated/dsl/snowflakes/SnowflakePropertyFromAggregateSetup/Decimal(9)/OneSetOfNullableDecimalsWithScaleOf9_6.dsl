module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableDecimalsWithScaleOf9_6 {
    Set<Decimal(9)?> oneSetOfNullableDecimalsWithScaleOf9;
  }

  snowflake OneSetOfNullableDecimalsWithScaleOf9_6Grid from OneSetOfNullableDecimalsWithScaleOf9_6 {
    oneSetOfNullableDecimalsWithScaleOf9;
  }
}
