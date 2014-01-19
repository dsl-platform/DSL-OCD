module CalculatedPropertyInValueSetup
{
  value OneSetOfOneXmls_4 {
    Set<Xml> oneSetOfOneXmls;

    calculated Set<Xml> calculatedOneSetOfOneXmls from 'it => it.oneSetOfOneXmls';

    calculated Set<Xml> persistedOneSetOfOneXmls from 'it => it.oneSetOfOneXmls' { persisted; }
  }
}
