module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneDates_6 {
    Set<Date> oneSetOfOneDates;
  }

  snowflake OneSetOfOneDates_6Grid from OneSetOfOneDates_6 {
    oneSetOfOneDates;
  }
}
