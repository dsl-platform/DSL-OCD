module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableDecimalsWithScaleOf9_5 {
    List<Decimal(9)?>? nullableListOfNullableDecimalsWithScaleOf9;
  }

  snowflake NullableListOfNullableDecimalsWithScaleOf9_5Grid from NullableListOfNullableDecimalsWithScaleOf9_5 {
    nullableListOfNullableDecimalsWithScaleOf9;
  }
}
