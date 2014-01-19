module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableImages_5 {
    Set<Image?>? nullableSetOfNullableImages;
  }

  snowflake NullableSetOfNullableImages_5Grid from NullableSetOfNullableImages_5 {
    nullableSetOfNullableImages;
  }
}
