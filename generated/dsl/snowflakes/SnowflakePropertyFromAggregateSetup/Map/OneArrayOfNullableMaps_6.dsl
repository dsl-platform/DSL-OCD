module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableMaps_6 {
    Array<Map?> oneArrayOfNullableMaps;
  }

  snowflake OneArrayOfNullableMaps_6Grid from OneArrayOfNullableMaps_6 {
    oneArrayOfNullableMaps;
  }
}
