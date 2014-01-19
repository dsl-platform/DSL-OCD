module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableFloats_6 {
    Set<Float?> oneSetOfNullableFloats;
  }

  snowflake OneSetOfNullableFloats_6Grid from OneSetOfNullableFloats_6 {
    oneSetOfNullableFloats;
  }
}
