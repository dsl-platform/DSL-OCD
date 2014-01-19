module SnowflakePropertyFromAggregateSetup
{
  aggregate OneString_6 {
    String oneString;
  }

  snowflake OneString_6Grid from OneString_6 {
    oneString;
  }
}
