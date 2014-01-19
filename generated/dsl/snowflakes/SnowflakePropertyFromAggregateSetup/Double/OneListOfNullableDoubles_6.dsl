module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableDoubles_6 {
    List<Double?> oneListOfNullableDoubles;
  }

  snowflake OneListOfNullableDoubles_6Grid from OneListOfNullableDoubles_6 {
    oneListOfNullableDoubles;
  }
}
