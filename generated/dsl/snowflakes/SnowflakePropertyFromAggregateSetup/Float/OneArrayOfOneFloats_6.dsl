module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneFloats_6 {
    Array<Float> oneArrayOfOneFloats;
  }

  snowflake OneArrayOfOneFloats_6Grid from OneArrayOfOneFloats_6 {
    oneArrayOfOneFloats;
  }
}
