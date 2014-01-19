module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableXmls_5 {
    List<Xml?>? nullableListOfNullableXmls;
  }

  snowflake NullableListOfNullableXmls_5Grid from NullableListOfNullableXmls_5 {
    nullableListOfNullableXmls;
  }
}
