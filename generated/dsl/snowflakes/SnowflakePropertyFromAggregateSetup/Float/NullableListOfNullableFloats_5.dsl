module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableListOfNullableFloats_5 {
    List<Float?>? nullableListOfNullableFloats;
  }

  snowflake NullableListOfNullableFloats_5Grid from NullableListOfNullableFloats_5 {
    nullableListOfNullableFloats;
  }
}
