module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableRectangles_5 {
    List<Rectangle?> oneListOfNullableRectangles;
  }

  snowflake OneListOfNullableRectangles_5Grid from OneListOfNullableRectangles_5 {
    oneListOfNullableRectangles;
  }
}
