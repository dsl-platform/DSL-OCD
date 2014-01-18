module CalculatedPropertyInAggregateSetup
{
  aggregate OneXml_3 {
    Xml oneXml;

    calculated Xml calculatedOneXml from 'it => it.oneXml';

    calculated Xml persistedOneXml from 'it => it.oneXml' { persisted; }
  }
}
