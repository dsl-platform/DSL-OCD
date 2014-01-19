module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneDecimalsWithScaleOf9_5 {
    Set<Decimal(9)>? nullableSetOfOneDecimalsWithScaleOf9;
  }

  snowflake NullableSetOfOneDecimalsWithScaleOf9_5Grid from NullableSetOfOneDecimalsWithScaleOf9_5 {
    nullableSetOfOneDecimalsWithScaleOf9;
  }
}
