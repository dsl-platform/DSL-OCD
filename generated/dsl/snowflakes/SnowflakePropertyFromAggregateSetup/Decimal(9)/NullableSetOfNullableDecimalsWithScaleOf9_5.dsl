module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableDecimalsWithScaleOf9_5 {
    Set<Decimal(9)?>? nullableSetOfNullableDecimalsWithScaleOf9;
  }

  snowflake NullableSetOfNullableDecimalsWithScaleOf9_5Grid from NullableSetOfNullableDecimalsWithScaleOf9_5 {
    nullableSetOfNullableDecimalsWithScaleOf9;
  }
}
