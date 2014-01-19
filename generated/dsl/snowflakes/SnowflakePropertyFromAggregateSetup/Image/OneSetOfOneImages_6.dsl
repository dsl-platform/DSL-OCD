module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneImages_6 {
    Set<Image> oneSetOfOneImages;
  }

  snowflake OneSetOfOneImages_6Grid from OneSetOfOneImages_6 {
    oneSetOfOneImages;
  }
}
