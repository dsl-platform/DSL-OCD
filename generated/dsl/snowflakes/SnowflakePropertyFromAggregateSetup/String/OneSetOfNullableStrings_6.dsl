module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableStrings_6 {
    Set<String?> oneSetOfNullableStrings;
  }

  snowflake OneSetOfNullableStrings_6Grid from OneSetOfNullableStrings_6 {
    oneSetOfNullableStrings;
  }
}
