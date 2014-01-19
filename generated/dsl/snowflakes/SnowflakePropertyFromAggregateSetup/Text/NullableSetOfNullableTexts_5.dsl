module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableTexts_5 {
    Set<Text?>? nullableSetOfNullableTexts;
  }

  snowflake NullableSetOfNullableTexts_5Grid from NullableSetOfNullableTexts_5 {
    nullableSetOfNullableTexts;
  }
}
