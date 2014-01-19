module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneDecimalsWithScaleOf9_6 {
    Array<Decimal(9)> oneArrayOfOneDecimalsWithScaleOf9;
  }

  snowflake OneArrayOfOneDecimalsWithScaleOf9_6Grid from OneArrayOfOneDecimalsWithScaleOf9_6 {
    oneArrayOfOneDecimalsWithScaleOf9;
  }
}
