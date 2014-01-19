module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneMonies_5 {
    List<Money>? nullableListOfOneMonies;
  }

  snowflake NullableListOfOneMonies_5Grid from NullableListOfOneMonies_5 {
    nullableListOfOneMonies;
  }
}
