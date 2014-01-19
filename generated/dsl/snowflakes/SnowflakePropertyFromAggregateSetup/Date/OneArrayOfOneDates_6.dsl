module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneDates_6 {
    Array<Date> oneArrayOfOneDates;
  }

  snowflake OneArrayOfOneDates_6Grid from OneArrayOfOneDates_6 {
    oneArrayOfOneDates;
  }
}
