module SnowflakePropertyFromAggregateSetup
{
  aggregate OneDouble_6 {
    Double oneDouble;
  }

  snowflake OneDouble_6Grid from OneDouble_6 {
    oneDouble;
  }
}
