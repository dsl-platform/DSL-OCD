module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfNullableFloats_5 {
    Array<Float?>? nullableArrayOfNullableFloats;
  }

  snowflake NullableArrayOfNullableFloats_5Grid from NullableArrayOfNullableFloats_5 {
    nullableArrayOfNullableFloats;
  }
}
