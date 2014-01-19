module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneTexts_5 {
    List<Text>? nullableListOfOneTexts;
  }

  snowflake NullableListOfOneTexts_5Grid from NullableListOfOneTexts_5 {
    nullableListOfOneTexts;
  }
}
