module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneXmls_4 {
    Array<Xml> oneArrayOfOneXmls;

    calculated Array<Xml> calculatedOneArrayOfOneXmls from 'it => it.oneArrayOfOneXmls';

    calculated Array<Xml> persistedOneArrayOfOneXmls from 'it => it.oneArrayOfOneXmls' { persisted; }
  }
}
