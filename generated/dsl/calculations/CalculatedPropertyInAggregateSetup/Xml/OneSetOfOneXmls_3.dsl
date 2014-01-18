module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneXmls_3 {
    Set<Xml> oneSetOfOneXmls;

    calculated Set<Xml> calculatedOneSetOfOneXmls from 'it => it.oneSetOfOneXmls';

    calculated Set<Xml> persistedOneSetOfOneXmls from 'it => it.oneSetOfOneXmls' { persisted; }
  }
}
