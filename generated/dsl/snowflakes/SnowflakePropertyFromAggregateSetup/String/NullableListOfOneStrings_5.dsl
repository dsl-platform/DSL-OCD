module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneStrings_5 {
    List<String>? nullableListOfOneStrings;
  }

  snowflake NullableListOfOneStrings_5Grid from NullableListOfOneStrings_5 {
    nullableListOfOneStrings;
  }
}
