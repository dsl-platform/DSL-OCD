module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableSetOfOneFloats_5 {
    Set<Float>? nullableSetOfOneFloats;
  }

  snowflake NullableSetOfOneFloats_5Grid from NullableSetOfOneFloats_5 {
    nullableSetOfOneFloats;
  }
}
