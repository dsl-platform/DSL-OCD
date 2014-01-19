module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableXmls_5 {
    Set<Xml?> oneSetOfNullableXmls;
  }

  snowflake OneSetOfNullableXmls_5Grid from OneSetOfNullableXmls_5 {
    oneSetOfNullableXmls;
  }
}
