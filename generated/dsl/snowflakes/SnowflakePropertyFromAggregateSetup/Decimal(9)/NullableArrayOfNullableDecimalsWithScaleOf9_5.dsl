module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableDecimalsWithScaleOf9_5 {
    Array<Decimal(9)?>? nullableArrayOfNullableDecimalsWithScaleOf9;
  }

  snowflake NullableArrayOfNullableDecimalsWithScaleOf9_5Grid from NullableArrayOfNullableDecimalsWithScaleOf9_5 {
    nullableArrayOfNullableDecimalsWithScaleOf9;
  }
}
