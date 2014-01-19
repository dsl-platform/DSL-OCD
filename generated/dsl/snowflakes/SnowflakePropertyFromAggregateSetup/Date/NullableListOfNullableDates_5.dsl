module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableDates_5 {
    List<Date?>? nullableListOfNullableDates;
  }

  snowflake NullableListOfNullableDates_5Grid from NullableListOfNullableDates_5 {
    nullableListOfNullableDates;
  }
}
