module SnowflakePropertyFromAggregateSetup
{
  aggregate OneBinary_6 {
    Binary oneBinary;
  }

  snowflake OneBinary_6Grid from OneBinary_6 {
    oneBinary;
  }
}
