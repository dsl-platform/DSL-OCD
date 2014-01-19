module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneRectangles_5 {
    Array<Rectangle> oneArrayOfOneRectangles;
  }

  snowflake OneArrayOfOneRectangles_5Grid from OneArrayOfOneRectangles_5 {
    oneArrayOfOneRectangles;
  }
}
