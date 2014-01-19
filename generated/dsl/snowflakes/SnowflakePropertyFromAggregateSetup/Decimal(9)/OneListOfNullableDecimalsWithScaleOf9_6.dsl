module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableDecimalsWithScaleOf9_6 {
    List<Decimal(9)?> oneListOfNullableDecimalsWithScaleOf9;
  }

  snowflake OneListOfNullableDecimalsWithScaleOf9_6Grid from OneListOfNullableDecimalsWithScaleOf9_6 {
    oneListOfNullableDecimalsWithScaleOf9;
  }
}
