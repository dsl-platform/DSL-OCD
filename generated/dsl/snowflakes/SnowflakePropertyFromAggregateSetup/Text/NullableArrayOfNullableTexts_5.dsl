module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableTexts_5 {
    Array<Text?>? nullableArrayOfNullableTexts;
  }

  snowflake NullableArrayOfNullableTexts_5Grid from NullableArrayOfNullableTexts_5 {
    nullableArrayOfNullableTexts;
  }
}
