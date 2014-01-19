module SnowflakePropertyFromAggregateSetup
{
  aggregate OneBoolean_6 {
    Boolean oneBoolean;
  }

  snowflake OneBoolean_6Grid from OneBoolean_6 {
    oneBoolean;
  }
}
