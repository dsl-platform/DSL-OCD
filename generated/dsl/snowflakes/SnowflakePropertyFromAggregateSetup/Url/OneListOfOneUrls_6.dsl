module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneUrls_6 {
    List<Url> oneListOfOneUrls;
  }

  snowflake OneListOfOneUrls_6Grid from OneListOfOneUrls_6 {
    oneListOfOneUrls;
  }
}
