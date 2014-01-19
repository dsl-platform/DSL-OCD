module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneDoubles_6 {
    Set<Double> oneSetOfOneDoubles;
  }

  snowflake OneSetOfOneDoubles_6Grid from OneSetOfOneDoubles_6 {
    oneSetOfOneDoubles;
  }
}
