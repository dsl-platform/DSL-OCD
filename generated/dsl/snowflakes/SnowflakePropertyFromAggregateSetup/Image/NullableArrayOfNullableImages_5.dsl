module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableImages_5 {
    Array<Image?>? nullableArrayOfNullableImages;
  }

  snowflake NullableArrayOfNullableImages_5Grid from NullableArrayOfNullableImages_5 {
    nullableArrayOfNullableImages;
  }
}
