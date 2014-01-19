module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableDecimal_5 {
    Decimal? nullableDecimal;
  }

  snowflake NullableDecimal_5Grid from NullableDecimal_5 {
    nullableDecimal;
  }
}
