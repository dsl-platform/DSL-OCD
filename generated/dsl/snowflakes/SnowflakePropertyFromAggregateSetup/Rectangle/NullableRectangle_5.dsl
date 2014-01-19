module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableRectangle_5 {
    Rectangle? nullableRectangle;
  }

  snowflake NullableRectangle_5Grid from NullableRectangle_5 {
    nullableRectangle;
  }
}
