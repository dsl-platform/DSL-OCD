module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableRectangles_5 {
    Set<Rectangle?> oneSetOfNullableRectangles;
  }

  snowflake OneSetOfNullableRectangles_5Grid from OneSetOfNullableRectangles_5 {
    oneSetOfNullableRectangles;
  }
}
