module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneImages_5 {
    Set<Image>? nullableSetOfOneImages;
  }

  snowflake NullableSetOfOneImages_5Grid from NullableSetOfOneImages_5 {
    nullableSetOfOneImages;
  }
}
