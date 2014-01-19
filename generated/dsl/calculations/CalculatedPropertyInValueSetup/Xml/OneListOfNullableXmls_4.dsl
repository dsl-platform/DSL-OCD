module CalculatedPropertyInValueSetup
{
  value OneListOfNullableXmls_4 {
    List<Xml?> oneListOfNullableXmls;

    calculated List<Xml?> calculatedOneListOfNullableXmls from 'it => it.oneListOfNullableXmls';

    calculated List<Xml?> persistedOneListOfNullableXmls from 'it => it.oneListOfNullableXmls' { persisted; }
  }
}
