module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableUrls_5 {
    Set<Url?>? nullableSetOfNullableUrls;
  }

  snowflake NullableSetOfNullableUrls_5Grid from NullableSetOfNullableUrls_5 {
    nullableSetOfNullableUrls;
  }
}
