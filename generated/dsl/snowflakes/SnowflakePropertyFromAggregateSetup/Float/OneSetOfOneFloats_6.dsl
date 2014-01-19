module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneFloats_6 {
    Set<Float> oneSetOfOneFloats;
  }

  snowflake OneSetOfOneFloats_6Grid from OneSetOfOneFloats_6 {
    oneSetOfOneFloats;
  }
}
