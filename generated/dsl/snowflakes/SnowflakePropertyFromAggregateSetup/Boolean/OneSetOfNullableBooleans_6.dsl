module SnowflakePropertyFromAggregateSetup
{
  aggregate OneSetOfNullableBooleans_6 {
    Set<Boolean?> oneSetOfNullableBooleans;
  }

  snowflake OneSetOfNullableBooleans_6Grid from OneSetOfNullableBooleans_6 {
    oneSetOfNullableBooleans;
  }
}
