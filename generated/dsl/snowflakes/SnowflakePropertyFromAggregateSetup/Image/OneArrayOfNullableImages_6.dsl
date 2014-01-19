module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableImages_6 {
    Array<Image?> oneArrayOfNullableImages;
  }

  snowflake OneArrayOfNullableImages_6Grid from OneArrayOfNullableImages_6 {
    oneArrayOfNullableImages;
  }
}
