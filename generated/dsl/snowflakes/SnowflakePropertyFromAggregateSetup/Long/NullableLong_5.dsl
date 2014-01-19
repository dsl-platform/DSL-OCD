module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableLong_5 {
    Long? nullableLong;
  }

  snowflake NullableLong_5Grid from NullableLong_5 {
    nullableLong;
  }
}
