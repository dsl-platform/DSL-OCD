module SnowflakePropertyFromAggregateSetup
{
  aggregate OneListOfOneIps_6 {
    List<Ip> oneListOfOneIps;
  }

  snowflake OneListOfOneIps_6Grid from OneListOfOneIps_6 {
    oneListOfOneIps;
  }
}
