module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneRectangles_5 {
    Array<Rectangle>? nullableArrayOfOneRectangles;
  }

  snowflake NullableArrayOfOneRectangles_5Grid from NullableArrayOfOneRectangles_5 {
    nullableArrayOfOneRectangles;
  }
}
