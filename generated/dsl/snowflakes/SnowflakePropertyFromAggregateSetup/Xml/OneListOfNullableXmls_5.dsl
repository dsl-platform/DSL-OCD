module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableXmls_5 {
    List<Xml?> oneListOfNullableXmls;
  }

  snowflake OneListOfNullableXmls_5Grid from OneListOfNullableXmls_5 {
    oneListOfNullableXmls;
  }
}
