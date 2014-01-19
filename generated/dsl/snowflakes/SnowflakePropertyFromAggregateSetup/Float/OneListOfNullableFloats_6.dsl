module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfNullableFloats_6 {
    List<Float?> oneListOfNullableFloats;
  }

  snowflake OneListOfNullableFloats_6Grid from OneListOfNullableFloats_6 {
    oneListOfNullableFloats;
  }
}
