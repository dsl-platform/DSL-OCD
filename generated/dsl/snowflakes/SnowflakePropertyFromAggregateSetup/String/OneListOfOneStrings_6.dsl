module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneStrings_6 {
    List<String> oneListOfOneStrings;
  }

  snowflake OneListOfOneStrings_6Grid from OneListOfOneStrings_6 {
    oneListOfOneStrings;
  }
}
