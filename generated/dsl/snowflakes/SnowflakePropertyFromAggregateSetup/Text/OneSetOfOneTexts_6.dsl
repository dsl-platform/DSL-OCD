module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneTexts_6 {
    Set<Text> oneSetOfOneTexts;
  }

  snowflake OneSetOfOneTexts_6Grid from OneSetOfOneTexts_6 {
    oneSetOfOneTexts;
  }
}
