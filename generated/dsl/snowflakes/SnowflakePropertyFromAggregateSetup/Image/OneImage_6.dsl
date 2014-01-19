module SnowflakePropertyFromAggregateSetup
{
  aggregate OneImage_6 {
    Image oneImage;
  }

  snowflake OneImage_6Grid from OneImage_6 {
    oneImage;
  }
}
