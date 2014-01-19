module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableStrings_6 {
    List<String?> oneListOfNullableStrings;
  }

  snowflake OneListOfNullableStrings_6Grid from OneListOfNullableStrings_6 {
    oneListOfNullableStrings;
  }
}
