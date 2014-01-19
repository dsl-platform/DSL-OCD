module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullablePoints_5 {
    Set<Point?>? nullableSetOfNullablePoints;
  }

  snowflake NullableSetOfNullablePoints_5Grid from NullableSetOfNullablePoints_5 {
    nullableSetOfNullablePoints;
  }
}
