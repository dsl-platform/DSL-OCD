module SnowflakePropertyFromAggregateSetup
{
  aggregate OneLong_6 {
    Long oneLong;
  }

  snowflake OneLong_6Grid from OneLong_6 {
    oneLong;
  }
}
