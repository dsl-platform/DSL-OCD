module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableStrings_5 {
    List<String?>? nullableListOfNullableStrings;
  }

  snowflake NullableListOfNullableStrings_5Grid from NullableListOfNullableStrings_5 {
    nullableListOfNullableStrings;
  }
}
