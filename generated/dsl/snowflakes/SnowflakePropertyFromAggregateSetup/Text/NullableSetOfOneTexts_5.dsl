module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneTexts_5 {
    Set<Text>? nullableSetOfOneTexts;
  }

  snowflake NullableSetOfOneTexts_5Grid from NullableSetOfOneTexts_5 {
    nullableSetOfOneTexts;
  }
}
