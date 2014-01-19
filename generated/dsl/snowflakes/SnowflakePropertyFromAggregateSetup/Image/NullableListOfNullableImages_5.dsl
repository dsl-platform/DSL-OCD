module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableImages_5 {
    List<Image?>? nullableListOfNullableImages;
  }

  snowflake NullableListOfNullableImages_5Grid from NullableListOfNullableImages_5 {
    nullableListOfNullableImages;
  }
}
