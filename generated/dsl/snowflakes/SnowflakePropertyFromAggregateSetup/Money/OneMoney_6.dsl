module SnowflakePropertyFromAggregateSetup
{
  aggregate OneMoney_6 {
    Money oneMoney;
  }

  snowflake OneMoney_6Grid from OneMoney_6 {
    oneMoney;
  }
}
