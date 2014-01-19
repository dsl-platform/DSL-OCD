module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneDates_5 {
    List<Date>? nullableListOfOneDates;
  }

  snowflake NullableListOfOneDates_5Grid from NullableListOfOneDates_5 {
    nullableListOfOneDates;
  }
}
