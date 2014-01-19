module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableUrls_6 {
    Array<Url?> oneArrayOfNullableUrls;
  }

  snowflake OneArrayOfNullableUrls_6Grid from OneArrayOfNullableUrls_6 {
    oneArrayOfNullableUrls;
  }
}
