module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableDoubles_5 {
    List<Double?>? nullableListOfNullableDoubles;
  }

  snowflake NullableListOfNullableDoubles_5Grid from NullableListOfNullableDoubles_5 {
    nullableListOfNullableDoubles;
  }
}
