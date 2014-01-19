module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneRectangles_5 {
    Set<Rectangle> oneSetOfOneRectangles;
  }

  snowflake OneSetOfOneRectangles_5Grid from OneSetOfOneRectangles_5 {
    oneSetOfOneRectangles;
  }
}
