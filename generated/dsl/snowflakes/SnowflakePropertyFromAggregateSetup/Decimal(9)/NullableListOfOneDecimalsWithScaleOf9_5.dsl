module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneDecimalsWithScaleOf9_5 {
    List<Decimal(9)>? nullableListOfOneDecimalsWithScaleOf9;
  }

  snowflake NullableListOfOneDecimalsWithScaleOf9_5Grid from NullableListOfOneDecimalsWithScaleOf9_5 {
    nullableListOfOneDecimalsWithScaleOf9;
  }
}
