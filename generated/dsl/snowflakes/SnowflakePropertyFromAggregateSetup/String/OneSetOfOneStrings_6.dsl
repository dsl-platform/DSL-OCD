module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneStrings_6 {
    Set<String> oneSetOfOneStrings;
  }

  snowflake OneSetOfOneStrings_6Grid from OneSetOfOneStrings_6 {
    oneSetOfOneStrings;
  }
}
