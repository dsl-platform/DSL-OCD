module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableXmls_3 {
    Set<Xml?> oneSetOfNullableXmls;

    calculated Set<Xml?> calculatedOneSetOfNullableXmls from 'it => it.oneSetOfNullableXmls';

    calculated Set<Xml?> persistedOneSetOfNullableXmls from 'it => it.oneSetOfNullableXmls' { persisted; }
  }
}
