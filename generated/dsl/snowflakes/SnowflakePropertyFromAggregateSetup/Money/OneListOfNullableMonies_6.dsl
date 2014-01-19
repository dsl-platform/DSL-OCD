module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableMonies_6 {
    List<Money?> oneListOfNullableMonies;
  }

  snowflake OneListOfNullableMonies_6Grid from OneListOfNullableMonies_6 {
    oneListOfNullableMonies;
  }
}
