module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneUrls_6 {
    Array<Url> oneArrayOfOneUrls;
  }

  snowflake OneArrayOfOneUrls_6Grid from OneArrayOfOneUrls_6 {
    oneArrayOfOneUrls;
  }
}
