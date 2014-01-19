module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableDates_6 {
    Array<Date?> oneArrayOfNullableDates;
  }

  snowflake OneArrayOfNullableDates_6Grid from OneArrayOfNullableDates_6 {
    oneArrayOfNullableDates;
  }
}
