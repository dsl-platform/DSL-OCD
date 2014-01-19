module SnowflakePropertyFromAggregateSetup
{
  aggregate OneArrayOfNullableStrings_6 {
    Array<String?> oneArrayOfNullableStrings;
  }

  snowflake OneArrayOfNullableStrings_6Grid from OneArrayOfNullableStrings_6 {
    oneArrayOfNullableStrings;
  }
}
