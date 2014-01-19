module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableTexts_6 {
    List<Text?> oneListOfNullableTexts;
  }

  snowflake OneListOfNullableTexts_6Grid from OneListOfNullableTexts_6 {
    oneListOfNullableTexts;
  }
}
