module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullablePoints_5 {
    Array<Point?> oneArrayOfNullablePoints;
  }

  snowflake OneArrayOfNullablePoints_5Grid from OneArrayOfNullablePoints_5 {
    oneArrayOfNullablePoints;
  }
}
