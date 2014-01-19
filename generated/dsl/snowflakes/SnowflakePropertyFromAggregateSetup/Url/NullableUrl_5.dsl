module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableUrl_5 {
    Url? nullableUrl;
  }

  snowflake NullableUrl_5Grid from NullableUrl_5 {
    nullableUrl;
  }
}
