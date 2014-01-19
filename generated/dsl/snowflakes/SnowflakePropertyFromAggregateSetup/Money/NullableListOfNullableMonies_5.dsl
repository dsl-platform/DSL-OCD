module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableMonies_5 {
    List<Money?>? nullableListOfNullableMonies;
  }

  snowflake NullableListOfNullableMonies_5Grid from NullableListOfNullableMonies_5 {
    nullableListOfNullableMonies;
  }
}
