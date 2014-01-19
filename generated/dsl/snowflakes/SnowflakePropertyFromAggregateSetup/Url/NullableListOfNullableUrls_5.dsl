module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableUrls_5 {
    List<Url?>? nullableListOfNullableUrls;
  }

  snowflake NullableListOfNullableUrls_5Grid from NullableListOfNullableUrls_5 {
    nullableListOfNullableUrls;
  }
}
