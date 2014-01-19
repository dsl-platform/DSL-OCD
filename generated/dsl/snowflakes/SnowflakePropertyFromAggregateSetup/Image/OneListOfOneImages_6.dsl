module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneImages_6 {
    List<Image> oneListOfOneImages;
  }

  snowflake OneListOfOneImages_6Grid from OneListOfOneImages_6 {
    oneListOfOneImages;
  }
}
