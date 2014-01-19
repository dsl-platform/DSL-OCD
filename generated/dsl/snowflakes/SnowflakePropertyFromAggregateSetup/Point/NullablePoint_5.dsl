module SnowflakePropertyFromAggregateSetup
{
  aggregate NullablePoint_5 {
    Point? nullablePoint;
  }

  snowflake NullablePoint_5Grid from NullablePoint_5 {
    nullablePoint;
  }
}
