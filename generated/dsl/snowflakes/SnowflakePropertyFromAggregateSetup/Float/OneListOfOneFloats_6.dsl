module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneFloats_6 {
    List<Float> oneListOfOneFloats;
  }

  snowflake OneListOfOneFloats_6Grid from OneListOfOneFloats_6 {
    oneListOfOneFloats;
  }
}
