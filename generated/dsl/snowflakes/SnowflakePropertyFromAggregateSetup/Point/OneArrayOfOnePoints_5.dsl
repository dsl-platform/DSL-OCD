module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOnePoints_5 {
    Array<Point> oneArrayOfOnePoints;
  }

  snowflake OneArrayOfOnePoints_5Grid from OneArrayOfOnePoints_5 {
    oneArrayOfOnePoints;
  }
}
