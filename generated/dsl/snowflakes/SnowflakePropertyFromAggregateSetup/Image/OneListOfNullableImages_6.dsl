module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableImages_6 {
    List<Image?> oneListOfNullableImages;
  }

  snowflake OneListOfNullableImages_6Grid from OneListOfNullableImages_6 {
    oneListOfNullableImages;
  }
}
