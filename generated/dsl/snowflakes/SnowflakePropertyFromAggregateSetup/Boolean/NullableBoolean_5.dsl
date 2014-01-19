module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableBoolean_5 {
    Boolean? nullableBoolean;
  }

  snowflake NullableBoolean_5Grid from NullableBoolean_5 {
    nullableBoolean;
  }
}
