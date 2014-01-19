module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableInteger_5 {
    Integer? nullableInteger;
  }

  snowflake NullableInteger_5Grid from NullableInteger_5 {
    nullableInteger;
  }
}
