module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableXmls_3 {
    Array<Xml?> oneArrayOfNullableXmls;

    calculated Array<Xml?> calculatedOneArrayOfNullableXmls from 'it => it.oneArrayOfNullableXmls';

    calculated Array<Xml?> persistedOneArrayOfNullableXmls from 'it => it.oneArrayOfNullableXmls' { persisted; }
  }
}
