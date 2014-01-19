module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableDoubles_6 {
    Array<Double?> oneArrayOfNullableDoubles;
  }

  snowflake OneArrayOfNullableDoubles_6Grid from OneArrayOfNullableDoubles_6 {
    oneArrayOfNullableDoubles;
  }
}
