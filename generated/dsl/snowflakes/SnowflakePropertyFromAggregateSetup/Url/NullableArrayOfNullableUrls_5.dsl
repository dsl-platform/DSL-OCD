module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableUrls_5 {
    Array<Url?>? nullableArrayOfNullableUrls;
  }

  snowflake NullableArrayOfNullableUrls_5Grid from NullableArrayOfNullableUrls_5 {
    nullableArrayOfNullableUrls;
  }
}
