module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableMonies_6 {
    Set<Money?> oneSetOfNullableMonies;
  }

  snowflake OneSetOfNullableMonies_6Grid from OneSetOfNullableMonies_6 {
    oneSetOfNullableMonies;
  }
}
