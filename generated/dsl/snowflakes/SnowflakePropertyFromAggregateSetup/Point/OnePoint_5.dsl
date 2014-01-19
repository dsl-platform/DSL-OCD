module SnowflakePropertyFromAggregateSetup
{
  aggregate OnePoint_5 {
    Point onePoint;
  }

  snowflake OnePoint_5Grid from OnePoint_5 {
    onePoint;
  }
}
