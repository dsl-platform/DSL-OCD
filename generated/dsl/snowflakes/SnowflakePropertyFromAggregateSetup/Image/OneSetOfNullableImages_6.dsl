module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableImages_6 {
    Set<Image?> oneSetOfNullableImages;
  }

  snowflake OneSetOfNullableImages_6Grid from OneSetOfNullableImages_6 {
    oneSetOfNullableImages;
  }
}
