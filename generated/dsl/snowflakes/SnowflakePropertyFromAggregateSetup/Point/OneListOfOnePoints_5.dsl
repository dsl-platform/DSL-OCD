module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOnePoints_5 {
    List<Point> oneListOfOnePoints;
  }

  snowflake OneListOfOnePoints_5Grid from OneListOfOnePoints_5 {
    oneListOfOnePoints;
  }
}
