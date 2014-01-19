module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableRectangles_5 {
    Set<Rectangle?>? nullableSetOfNullableRectangles;
  }

  snowflake NullableSetOfNullableRectangles_5Grid from NullableSetOfNullableRectangles_5 {
    nullableSetOfNullableRectangles;
  }
}
