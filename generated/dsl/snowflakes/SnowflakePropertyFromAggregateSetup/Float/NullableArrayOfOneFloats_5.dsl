module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableArrayOfOneFloats_5 {
    Array<Float>? nullableArrayOfOneFloats;
  }

  snowflake NullableArrayOfOneFloats_5Grid from NullableArrayOfOneFloats_5 {
    nullableArrayOfOneFloats;
  }
}
