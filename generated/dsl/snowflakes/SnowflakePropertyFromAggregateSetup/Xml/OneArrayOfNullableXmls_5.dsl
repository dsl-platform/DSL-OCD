module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableXmls_5 {
    Array<Xml?> oneArrayOfNullableXmls;
  }

  snowflake OneArrayOfNullableXmls_5Grid from OneArrayOfNullableXmls_5 {
    oneArrayOfNullableXmls;
  }
}
