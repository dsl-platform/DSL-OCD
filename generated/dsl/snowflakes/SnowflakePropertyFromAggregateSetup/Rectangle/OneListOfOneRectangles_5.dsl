module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneRectangles_5 {
    List<Rectangle> oneListOfOneRectangles;
  }

  snowflake OneListOfOneRectangles_5Grid from OneListOfOneRectangles_5 {
    oneListOfOneRectangles;
  }
}
