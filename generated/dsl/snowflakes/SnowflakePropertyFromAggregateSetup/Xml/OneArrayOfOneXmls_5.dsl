module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneXmls_5 {
    Array<Xml> oneArrayOfOneXmls;
  }

  snowflake OneArrayOfOneXmls_5Grid from OneArrayOfOneXmls_5 {
    oneArrayOfOneXmls;
  }
}
