module SnowflakePropertyFromAggregateSetup
{
  aggregate OneFloat_6 {
    Float oneFloat;
  }

  snowflake OneFloat_6Grid from OneFloat_6 {
    oneFloat;
  }
}
