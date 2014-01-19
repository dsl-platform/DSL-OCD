module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableMonies_5 {
    Set<Money?>? nullableSetOfNullableMonies;
  }

  snowflake NullableSetOfNullableMonies_5Grid from NullableSetOfNullableMonies_5 {
    nullableSetOfNullableMonies;
  }
}
