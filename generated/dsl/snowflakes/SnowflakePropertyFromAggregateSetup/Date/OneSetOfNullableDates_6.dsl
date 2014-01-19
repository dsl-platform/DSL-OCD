module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableDates_6 {
    Set<Date?> oneSetOfNullableDates;
  }

  snowflake OneSetOfNullableDates_6Grid from OneSetOfNullableDates_6 {
    oneSetOfNullableDates;
  }
}
