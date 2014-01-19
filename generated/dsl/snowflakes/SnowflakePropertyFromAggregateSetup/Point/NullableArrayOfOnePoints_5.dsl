module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOnePoints_5 {
    Array<Point>? nullableArrayOfOnePoints;
  }

  snowflake NullableArrayOfOnePoints_5Grid from NullableArrayOfOnePoints_5 {
    nullableArrayOfOnePoints;
  }
}
