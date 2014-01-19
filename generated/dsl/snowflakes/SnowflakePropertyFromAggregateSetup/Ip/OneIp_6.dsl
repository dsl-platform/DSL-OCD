module SnowflakePropertyFromAggregateSetup
{
  aggregate OneIp_6 {
    Ip oneIp;
  }

  snowflake OneIp_6Grid from OneIp_6 {
    oneIp;
  }
}
