module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableRectangles_5 {
    List<Rectangle?>? nullableListOfNullableRectangles;
  }

  snowflake NullableListOfNullableRectangles_5Grid from NullableListOfNullableRectangles_5 {
    nullableListOfNullableRectangles;
  }
}
