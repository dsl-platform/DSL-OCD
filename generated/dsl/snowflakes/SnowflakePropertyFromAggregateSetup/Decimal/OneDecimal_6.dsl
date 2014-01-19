module SnowflakePropertyFromAggregateSetup
{
  aggregate OneDecimal_6 {
    Decimal oneDecimal;
  }

  snowflake OneDecimal_6Grid from OneDecimal_6 {
    oneDecimal;
  }
}
