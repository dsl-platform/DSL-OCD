module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneDates_6 {
    List<Date> oneListOfOneDates;
  }

  snowflake OneListOfOneDates_6Grid from OneListOfOneDates_6 {
    oneListOfOneDates;
  }
}
