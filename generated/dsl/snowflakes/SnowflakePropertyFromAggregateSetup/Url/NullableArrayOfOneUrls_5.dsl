module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneUrls_5 {
    Array<Url>? nullableArrayOfOneUrls;
  }

  snowflake NullableArrayOfOneUrls_5Grid from NullableArrayOfOneUrls_5 {
    nullableArrayOfOneUrls;
  }
}
