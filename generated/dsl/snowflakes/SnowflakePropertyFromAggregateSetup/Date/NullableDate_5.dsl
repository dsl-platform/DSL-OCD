module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableDate_5 {
    Date? nullableDate;
  }

  snowflake NullableDate_5Grid from NullableDate_5 {
    nullableDate;
  }
}
