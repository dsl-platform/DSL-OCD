module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullablePoints_5 {
    Set<Point?> oneSetOfNullablePoints;
  }

  snowflake OneSetOfNullablePoints_5Grid from OneSetOfNullablePoints_5 {
    oneSetOfNullablePoints;
  }
}
