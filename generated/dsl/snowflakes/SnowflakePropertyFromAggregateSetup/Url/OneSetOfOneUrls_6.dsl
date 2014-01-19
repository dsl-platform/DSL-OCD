module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneUrls_6 {
    Set<Url> oneSetOfOneUrls;
  }

  snowflake OneSetOfOneUrls_6Grid from OneSetOfOneUrls_6 {
    oneSetOfOneUrls;
  }
}
