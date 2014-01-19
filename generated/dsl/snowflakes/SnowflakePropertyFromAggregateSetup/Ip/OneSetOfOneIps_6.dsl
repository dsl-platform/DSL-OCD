module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfOneIps_6 {
    Set<Ip> oneSetOfOneIps;
  }

  snowflake OneSetOfOneIps_6Grid from OneSetOfOneIps_6 {
    oneSetOfOneIps;
  }
}
