module SnowflakePropertyFromAggregateSetup
{
  aggregate OneMap_6 {
    Map oneMap;
  }

  snowflake OneMap_6Grid from OneMap_6 {
    oneMap;
  }
}
