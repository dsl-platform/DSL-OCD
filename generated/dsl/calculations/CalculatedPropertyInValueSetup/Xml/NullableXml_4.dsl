module CalculatedPropertyInValueSetup
{
  value NullableXml_4 {
    Xml? nullableXml;

    calculated Xml? calculatedNullableXml from 'it => it.nullableXml';

    calculated Xml? persistedNullableXml from 'it => it.nullableXml' { persisted; }
  }
}
