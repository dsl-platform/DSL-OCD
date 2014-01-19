module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneUrls_5 {
    List<Url>? nullableListOfOneUrls;
  }

  snowflake NullableListOfOneUrls_5Grid from NullableListOfOneUrls_5 {
    nullableListOfOneUrls;
  }
}
