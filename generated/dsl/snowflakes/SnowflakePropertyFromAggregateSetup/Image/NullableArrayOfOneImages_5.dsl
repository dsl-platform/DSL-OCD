module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneImages_5 {
    Array<Image>? nullableArrayOfOneImages;
  }

  snowflake NullableArrayOfOneImages_5Grid from NullableArrayOfOneImages_5 {
    nullableArrayOfOneImages;
  }
}
