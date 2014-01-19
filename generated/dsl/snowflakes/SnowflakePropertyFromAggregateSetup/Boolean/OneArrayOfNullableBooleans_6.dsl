module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableBooleans_6 {
    Array<Boolean?> oneArrayOfNullableBooleans;
  }

  snowflake OneArrayOfNullableBooleans_6Grid from OneArrayOfNullableBooleans_6 {
    oneArrayOfNullableBooleans;
  }
}
