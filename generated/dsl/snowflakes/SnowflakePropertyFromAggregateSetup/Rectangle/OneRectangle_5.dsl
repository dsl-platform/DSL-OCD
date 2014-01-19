module SnowflakePropertyFromAggregateSetup
{
  aggregate OneRectangle_5 {
    Rectangle oneRectangle;
  }

  snowflake OneRectangle_5Grid from OneRectangle_5 {
    oneRectangle;
  }
}
