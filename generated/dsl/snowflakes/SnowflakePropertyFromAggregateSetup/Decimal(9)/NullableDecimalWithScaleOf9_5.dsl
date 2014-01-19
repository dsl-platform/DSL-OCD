module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableDecimalWithScaleOf9_5 {
    Decimal(9)? nullableDecimalWithScaleOf9;
  }

  snowflake NullableDecimalWithScaleOf9_5Grid from NullableDecimalWithScaleOf9_5 {
    nullableDecimalWithScaleOf9;
  }
}
