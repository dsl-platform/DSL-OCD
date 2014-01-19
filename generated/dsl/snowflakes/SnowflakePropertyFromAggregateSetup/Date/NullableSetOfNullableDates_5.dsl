module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableDates_5 {
    Set<Date?>? nullableSetOfNullableDates;
  }

  snowflake NullableSetOfNullableDates_5Grid from NullableSetOfNullableDates_5 {
    nullableSetOfNullableDates;
  }
}
