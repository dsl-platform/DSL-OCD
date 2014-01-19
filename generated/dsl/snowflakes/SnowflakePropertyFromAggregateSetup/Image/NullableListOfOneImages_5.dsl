module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneImages_5 {
    List<Image>? nullableListOfOneImages;
  }

  snowflake NullableListOfOneImages_5Grid from NullableListOfOneImages_5 {
    nullableListOfOneImages;
  }
}
