module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableFloats_6 {
    Array<Float?> oneArrayOfNullableFloats;
  }

  snowflake OneArrayOfNullableFloats_6Grid from OneArrayOfNullableFloats_6 {
    oneArrayOfNullableFloats;
  }
}
