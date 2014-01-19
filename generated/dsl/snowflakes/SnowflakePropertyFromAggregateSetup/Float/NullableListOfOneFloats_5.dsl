module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfOneFloats_5 {
    List<Float>? nullableListOfOneFloats;
  }

  snowflake NullableListOfOneFloats_5Grid from NullableListOfOneFloats_5 {
    nullableListOfOneFloats;
  }
}
