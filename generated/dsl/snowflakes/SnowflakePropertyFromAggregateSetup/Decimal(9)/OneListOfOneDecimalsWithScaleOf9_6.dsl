module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneDecimalsWithScaleOf9_6 {
    List<Decimal(9)> oneListOfOneDecimalsWithScaleOf9;
  }

  snowflake OneListOfOneDecimalsWithScaleOf9_6Grid from OneListOfOneDecimalsWithScaleOf9_6 {
    oneListOfOneDecimalsWithScaleOf9;
  }
}
