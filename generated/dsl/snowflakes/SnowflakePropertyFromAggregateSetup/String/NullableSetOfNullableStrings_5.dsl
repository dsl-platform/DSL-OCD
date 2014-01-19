module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableStrings_5 {
    Set<String?>? nullableSetOfNullableStrings;
  }

  snowflake NullableSetOfNullableStrings_5Grid from NullableSetOfNullableStrings_5 {
    nullableSetOfNullableStrings;
  }
}
