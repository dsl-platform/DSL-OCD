module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableFloat_5 {
    Float? nullableFloat;
  }

  snowflake NullableFloat_5Grid from NullableFloat_5 {
    nullableFloat;
  }
}
