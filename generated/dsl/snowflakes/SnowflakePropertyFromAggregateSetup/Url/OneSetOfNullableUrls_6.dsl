module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableUrls_6 {
    Set<Url?> oneSetOfNullableUrls;
  }

  snowflake OneSetOfNullableUrls_6Grid from OneSetOfNullableUrls_6 {
    oneSetOfNullableUrls;
  }
}
