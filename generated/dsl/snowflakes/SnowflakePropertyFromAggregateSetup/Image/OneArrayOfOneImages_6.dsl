module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneImages_6 {
    Array<Image> oneArrayOfOneImages;
  }

  snowflake OneArrayOfOneImages_6Grid from OneArrayOfOneImages_6 {
    oneArrayOfOneImages;
  }
}
