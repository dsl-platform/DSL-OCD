module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableDoubles_6 {
    Set<Double?> oneSetOfNullableDoubles;
  }

  snowflake OneSetOfNullableDoubles_6Grid from OneSetOfNullableDoubles_6 {
    oneSetOfNullableDoubles;
  }
}
