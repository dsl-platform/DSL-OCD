module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOnePoints_5 {
    Set<Point> oneSetOfOnePoints;
  }

  snowflake OneSetOfOnePoints_5Grid from OneSetOfOnePoints_5 {
    oneSetOfOnePoints;
  }
}
