module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneUrls_5 {
    Set<Url>? nullableSetOfOneUrls;
  }

  snowflake NullableSetOfOneUrls_5Grid from NullableSetOfOneUrls_5 {
    nullableSetOfOneUrls;
  }
}
