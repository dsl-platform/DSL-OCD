module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneMonies_5 {
    Set<Money>? nullableSetOfOneMonies;
  }

  snowflake NullableSetOfOneMonies_5Grid from NullableSetOfOneMonies_5 {
    nullableSetOfOneMonies;
  }
}
