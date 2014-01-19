module SnowflakePropertyFromAggregateSetup
{
  aggregate OneGuid_6 {
    Guid oneGuid;
  }

  snowflake OneGuid_6Grid from OneGuid_6 {
    oneGuid;
  }
}
