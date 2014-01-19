module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableRectangles_5 {
    Array<Rectangle?> oneArrayOfNullableRectangles;
  }

  snowflake OneArrayOfNullableRectangles_5Grid from OneArrayOfNullableRectangles_5 {
    oneArrayOfNullableRectangles;
  }
}
