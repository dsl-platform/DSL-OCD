module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableDates_5 {
    Array<Date?>? nullableArrayOfNullableDates;
  }

  snowflake NullableArrayOfNullableDates_5Grid from NullableArrayOfNullableDates_5 {
    nullableArrayOfNullableDates;
  }
}
