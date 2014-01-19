module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneDoubles_6 {
    Array<Double> oneArrayOfOneDoubles;
  }

  snowflake OneArrayOfOneDoubles_6Grid from OneArrayOfOneDoubles_6 {
    oneArrayOfOneDoubles;
  }
}
