module SnowflakePropertyFromAggregateSetup
{
  aggregate OneDate_6 {
    Date oneDate;
  }

  snowflake OneDate_6Grid from OneDate_6 {
    oneDate;
  }
}
