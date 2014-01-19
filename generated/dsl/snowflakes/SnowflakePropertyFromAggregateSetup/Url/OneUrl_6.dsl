module SnowflakePropertyFromAggregateSetup
{
  aggregate OneUrl_6 {
    Url oneUrl;
  }

  snowflake OneUrl_6Grid from OneUrl_6 {
    oneUrl;
  }
}
