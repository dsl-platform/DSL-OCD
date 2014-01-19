module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableXmls_4 {
    Set<Xml?> oneSetOfNullableXmls;

    calculated Set<Xml?> calculatedOneSetOfNullableXmls from 'it => it.oneSetOfNullableXmls';

    calculated Set<Xml?> persistedOneSetOfNullableXmls from 'it => it.oneSetOfNullableXmls' { persisted; }
  }
}
