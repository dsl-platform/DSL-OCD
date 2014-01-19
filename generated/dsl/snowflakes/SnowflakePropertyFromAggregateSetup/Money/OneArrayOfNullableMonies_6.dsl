module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableMonies_6 {
    Array<Money?> oneArrayOfNullableMonies;
  }

  snowflake OneArrayOfNullableMonies_6Grid from OneArrayOfNullableMonies_6 {
    oneArrayOfNullableMonies;
  }
}
