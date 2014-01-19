module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneRectangles_5 {
    Set<Rectangle>? nullableSetOfOneRectangles;
  }

  snowflake NullableSetOfOneRectangles_5Grid from NullableSetOfOneRectangles_5 {
    nullableSetOfOneRectangles;
  }
}
