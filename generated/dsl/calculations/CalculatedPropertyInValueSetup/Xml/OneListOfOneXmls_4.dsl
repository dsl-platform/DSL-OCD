module CalculatedPropertyInValueSetup
{
  value OneListOfOneXmls_4 {
    List<Xml> oneListOfOneXmls;

    calculated List<Xml> calculatedOneListOfOneXmls from 'it => it.oneListOfOneXmls';

    calculated List<Xml> persistedOneListOfOneXmls from 'it => it.oneListOfOneXmls' { persisted; }
  }
}
