module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneRectangles_5 {
    List<Rectangle>? nullableListOfOneRectangles;
  }

  snowflake NullableListOfOneRectangles_5Grid from NullableListOfOneRectangles_5 {
    nullableListOfOneRectangles;
  }
}
