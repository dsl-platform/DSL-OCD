module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableDecimalsWithScaleOf9_6 {
    Array<Decimal(9)?> oneArrayOfNullableDecimalsWithScaleOf9;
  }

  snowflake OneArrayOfNullableDecimalsWithScaleOf9_6Grid from OneArrayOfNullableDecimalsWithScaleOf9_6 {
    oneArrayOfNullableDecimalsWithScaleOf9;
  }
}
