module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneTexts_6 {
    List<Text> oneListOfOneTexts;
  }

  snowflake OneListOfOneTexts_6Grid from OneListOfOneTexts_6 {
    oneListOfOneTexts;
  }
}
