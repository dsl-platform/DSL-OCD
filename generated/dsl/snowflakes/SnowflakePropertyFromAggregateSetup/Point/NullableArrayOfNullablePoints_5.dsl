module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullablePoints_5 {
    Array<Point?>? nullableArrayOfNullablePoints;
  }

  snowflake NullableArrayOfNullablePoints_5Grid from NullableArrayOfNullablePoints_5 {
    nullableArrayOfNullablePoints;
  }
}
