module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableGuid_5 {
    Guid? nullableGuid;
  }

  snowflake NullableGuid_5Grid from NullableGuid_5 {
    nullableGuid;
  }
}
