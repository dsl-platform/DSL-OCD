module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneTexts_5 {
    Array<Text>? nullableArrayOfOneTexts;
  }

  snowflake NullableArrayOfOneTexts_5Grid from NullableArrayOfOneTexts_5 {
    nullableArrayOfOneTexts;
  }
}
