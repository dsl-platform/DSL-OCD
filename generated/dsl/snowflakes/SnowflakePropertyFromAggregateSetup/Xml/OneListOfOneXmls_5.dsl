module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneXmls_5 {
    List<Xml> oneListOfOneXmls;
  }

  snowflake OneListOfOneXmls_5Grid from OneListOfOneXmls_5 {
    oneListOfOneXmls;
  }
}
