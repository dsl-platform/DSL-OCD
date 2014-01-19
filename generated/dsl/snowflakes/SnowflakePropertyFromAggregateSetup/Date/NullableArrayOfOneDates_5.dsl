module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneDates_5 {
    Array<Date>? nullableArrayOfOneDates;
  }

  snowflake NullableArrayOfOneDates_5Grid from NullableArrayOfOneDates_5 {
    nullableArrayOfOneDates;
  }
}
