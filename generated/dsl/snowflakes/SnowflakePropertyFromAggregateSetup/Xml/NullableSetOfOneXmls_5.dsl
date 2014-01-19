module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneXmls_5 {
    Set<Xml>? nullableSetOfOneXmls;
  }

  snowflake NullableSetOfOneXmls_5Grid from NullableSetOfOneXmls_5 {
    nullableSetOfOneXmls;
  }
}
