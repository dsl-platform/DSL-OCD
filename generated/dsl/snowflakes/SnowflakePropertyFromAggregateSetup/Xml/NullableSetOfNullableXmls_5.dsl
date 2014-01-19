module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableXmls_5 {
    Set<Xml?>? nullableSetOfNullableXmls;
  }

  snowflake NullableSetOfNullableXmls_5Grid from NullableSetOfNullableXmls_5 {
    nullableSetOfNullableXmls;
  }
}
