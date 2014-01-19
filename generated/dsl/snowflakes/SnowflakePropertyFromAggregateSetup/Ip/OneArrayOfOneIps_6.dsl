module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfOneIps_6 {
    Array<Ip> oneArrayOfOneIps;
  }

  snowflake OneArrayOfOneIps_6Grid from OneArrayOfOneIps_6 {
    oneArrayOfOneIps;
  }
}
