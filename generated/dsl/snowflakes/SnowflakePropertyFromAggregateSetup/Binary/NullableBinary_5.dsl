module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableBinary_5 {
    Binary? nullableBinary;
  }

  snowflake NullableBinary_5Grid from NullableBinary_5 {
    nullableBinary;
  }
}
