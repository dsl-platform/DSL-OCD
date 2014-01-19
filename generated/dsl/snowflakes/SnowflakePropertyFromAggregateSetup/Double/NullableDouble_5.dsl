module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableDouble_5 {
    Double? nullableDouble;
  }

  snowflake NullableDouble_5Grid from NullableDouble_5 {
    nullableDouble;
  }
}
