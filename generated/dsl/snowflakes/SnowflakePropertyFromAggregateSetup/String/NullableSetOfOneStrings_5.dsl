module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneStrings_5 {
    Set<String>? nullableSetOfOneStrings;
  }

  snowflake NullableSetOfOneStrings_5Grid from NullableSetOfOneStrings_5 {
    nullableSetOfOneStrings;
  }
}
