module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneDecimalsWithScaleOf9_6 {
    Set<Decimal(9)> oneSetOfOneDecimalsWithScaleOf9;
  }

  snowflake OneSetOfOneDecimalsWithScaleOf9_6Grid from OneSetOfOneDecimalsWithScaleOf9_6 {
    oneSetOfOneDecimalsWithScaleOf9;
  }
}
