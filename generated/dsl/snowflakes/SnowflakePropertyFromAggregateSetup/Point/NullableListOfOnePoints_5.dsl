module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOnePoints_5 {
    List<Point>? nullableListOfOnePoints;
  }

  snowflake NullableListOfOnePoints_5Grid from NullableListOfOnePoints_5 {
    nullableListOfOnePoints;
  }
}
