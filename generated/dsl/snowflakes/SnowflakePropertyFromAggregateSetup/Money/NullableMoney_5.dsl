module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableMoney_5 {
    Money? nullableMoney;
  }

  snowflake NullableMoney_5Grid from NullableMoney_5 {
    nullableMoney;
  }
}
