module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableTexts_6 {
    Set<Text?> oneSetOfNullableTexts;
  }

  snowflake OneSetOfNullableTexts_6Grid from OneSetOfNullableTexts_6 {
    oneSetOfNullableTexts;
  }
}
