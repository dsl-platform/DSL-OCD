module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableTexts_6 {
    Array<Text?> oneArrayOfNullableTexts;
  }

  snowflake OneArrayOfNullableTexts_6Grid from OneArrayOfNullableTexts_6 {
    oneArrayOfNullableTexts;
  }
}
