module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneDoubles_5 {
    List<Double>? nullableListOfOneDoubles;
  }

  snowflake NullableListOfOneDoubles_5Grid from NullableListOfOneDoubles_5 {
    nullableListOfOneDoubles;
  }
}
