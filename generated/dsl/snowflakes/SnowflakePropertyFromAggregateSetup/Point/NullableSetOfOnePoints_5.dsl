module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOnePoints_5 {
    Set<Point>? nullableSetOfOnePoints;
  }

  snowflake NullableSetOfOnePoints_5Grid from NullableSetOfOnePoints_5 {
    nullableSetOfOnePoints;
  }
}
