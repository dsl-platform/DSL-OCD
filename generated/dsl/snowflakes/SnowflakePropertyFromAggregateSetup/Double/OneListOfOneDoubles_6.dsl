module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneDoubles_6 {
    List<Double> oneListOfOneDoubles;
  }

  snowflake OneListOfOneDoubles_6Grid from OneListOfOneDoubles_6 {
    oneListOfOneDoubles;
  }
}
