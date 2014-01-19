module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableString_5 {
    String? nullableString;
  }

  snowflake NullableString_5Grid from NullableString_5 {
    nullableString;
  }
}
