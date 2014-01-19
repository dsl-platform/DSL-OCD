module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneXmls_5 {
    Set<Xml> oneSetOfOneXmls;
  }

  snowflake OneSetOfOneXmls_5Grid from OneSetOfOneXmls_5 {
    oneSetOfOneXmls;
  }
}
