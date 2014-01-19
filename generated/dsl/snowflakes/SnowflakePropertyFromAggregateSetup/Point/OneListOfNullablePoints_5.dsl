module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullablePoints_5 {
    List<Point?> oneListOfNullablePoints;
  }

  snowflake OneListOfNullablePoints_5Grid from OneListOfNullablePoints_5 {
    oneListOfNullablePoints;
  }
}
