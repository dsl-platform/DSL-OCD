module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableRectangles_5 {
    Array<Rectangle?>? nullableArrayOfNullableRectangles;
  }

  snowflake NullableArrayOfNullableRectangles_5Grid from NullableArrayOfNullableRectangles_5 {
    nullableArrayOfNullableRectangles;
  }
}
