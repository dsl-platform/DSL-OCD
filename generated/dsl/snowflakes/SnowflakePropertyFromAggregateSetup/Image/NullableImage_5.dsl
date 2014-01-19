module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableImage_5 {
    Image? nullableImage;
  }

  snowflake NullableImage_5Grid from NullableImage_5 {
    nullableImage;
  }
}
