module SnowflakePropertyFromAggregateSetup
{
  aggregate OneDecimalWithScaleOf9_6 {
    Decimal(9) oneDecimalWithScaleOf9;
  }

  snowflake OneDecimalWithScaleOf9_6Grid from OneDecimalWithScaleOf9_6 {
    oneDecimalWithScaleOf9;
  }
}
