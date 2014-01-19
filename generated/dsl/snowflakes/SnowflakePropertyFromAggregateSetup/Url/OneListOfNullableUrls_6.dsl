module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableUrls_6 {
    List<Url?> oneListOfNullableUrls;
  }

  snowflake OneListOfNullableUrls_6Grid from OneListOfNullableUrls_6 {
    oneListOfNullableUrls;
  }
}
