module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableDates_6 {
    List<Date?> oneListOfNullableDates;
  }

  snowflake OneListOfNullableDates_6Grid from OneListOfNullableDates_6 {
    oneListOfNullableDates;
  }
}
