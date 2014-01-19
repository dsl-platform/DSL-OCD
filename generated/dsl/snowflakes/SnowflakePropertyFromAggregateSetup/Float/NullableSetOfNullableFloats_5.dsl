module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfNullableFloats_5 {
    Set<Float?>? nullableSetOfNullableFloats;
  }

  snowflake NullableSetOfNullableFloats_5Grid from NullableSetOfNullableFloats_5 {
    nullableSetOfNullableFloats;
  }
}
