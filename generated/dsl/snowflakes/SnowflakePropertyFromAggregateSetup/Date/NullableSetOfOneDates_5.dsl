module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneDates_5 {
    Set<Date>? nullableSetOfOneDates;
  }

  snowflake NullableSetOfOneDates_5Grid from NullableSetOfOneDates_5 {
    nullableSetOfOneDates;
  }
}
