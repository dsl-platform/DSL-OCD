module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableTexts_5 {
    List<Text?>? nullableListOfNullableTexts;
  }

  snowflake NullableListOfNullableTexts_5Grid from NullableListOfNullableTexts_5 {
    nullableListOfNullableTexts;
  }
}
