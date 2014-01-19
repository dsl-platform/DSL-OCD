module CalculatedPropertyInValueSetup
{
  value OneXml_4 {
    Xml oneXml;

    calculated Xml calculatedOneXml from 'it => it.oneXml';

    calculated Xml persistedOneXml from 'it => it.oneXml' { persisted; }
  }
}
