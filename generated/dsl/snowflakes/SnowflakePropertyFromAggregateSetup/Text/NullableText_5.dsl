module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableText_5 {
    Text? nullableText;
  }

  snowflake NullableText_5Grid from NullableText_5 {
    nullableText;
  }
}
