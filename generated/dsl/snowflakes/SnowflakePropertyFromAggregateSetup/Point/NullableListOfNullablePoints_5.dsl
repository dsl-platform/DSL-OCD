module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullablePoints_5 {
    List<Point?>? nullableListOfNullablePoints;
  }

  snowflake NullableListOfNullablePoints_5Grid from NullableListOfNullablePoints_5 {
    nullableListOfNullablePoints;
  }
}
