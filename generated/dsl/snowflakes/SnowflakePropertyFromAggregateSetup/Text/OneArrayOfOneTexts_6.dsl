module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneTexts_6 {
    Array<Text> oneArrayOfOneTexts;
  }

  snowflake OneArrayOfOneTexts_6Grid from OneArrayOfOneTexts_6 {
    oneArrayOfOneTexts;
  }
}
