module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneXmls_5 {
    List<Xml>? nullableListOfOneXmls;
  }

  snowflake NullableListOfOneXmls_5Grid from NullableListOfOneXmls_5 {
    nullableListOfOneXmls;
  }
}
