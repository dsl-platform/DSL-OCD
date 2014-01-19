module SnowflakePropertyFromAggregateSetup
{
  aggregate OneInteger_6 {
    Integer oneInteger;
  }

  snowflake OneInteger_6Grid from OneInteger_6 {
    oneInteger;
  }
}
