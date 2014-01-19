module SnowflakePropertyFromAggregateSetup
{
  aggregate NullableXml_5 {
    Xml? nullableXml;
  }

  snowflake NullableXml_5Grid from NullableXml_5 {
    nullableXml;
  }
}
