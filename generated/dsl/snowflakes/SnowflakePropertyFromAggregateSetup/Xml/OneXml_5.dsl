module SnowflakePropertyFromAggregateSetup
{
  aggregate OneXml_5 {
    Xml oneXml;
  }

  snowflake OneXml_5Grid from OneXml_5 {
    oneXml;
  }
}
