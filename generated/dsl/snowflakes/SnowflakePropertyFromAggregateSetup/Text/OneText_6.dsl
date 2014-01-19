module SnowflakePropertyFromAggregateSetup
{
  aggregate OneText_6 {
    Text oneText;
  }

  snowflake OneText_6Grid from OneText_6 {
    oneText;
  }
}
