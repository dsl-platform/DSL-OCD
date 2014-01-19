module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneDecimalsWithScaleOf9_5 {
    Array<Decimal(9)>? nullableArrayOfOneDecimalsWithScaleOf9;
  }

  snowflake NullableArrayOfOneDecimalsWithScaleOf9_5Grid from NullableArrayOfOneDecimalsWithScaleOf9_5 {
    nullableArrayOfOneDecimalsWithScaleOf9;
  }
}
