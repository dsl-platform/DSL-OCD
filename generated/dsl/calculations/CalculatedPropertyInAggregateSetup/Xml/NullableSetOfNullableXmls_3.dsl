module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableXmls_3 {
    Set<Xml?>? nullableSetOfNullableXmls;

    calculated Set<Xml?>? calculatedNullableSetOfNullableXmls from 'it => it.nullableSetOfNullableXmls';

    calculated Set<Xml?>? persistedNullableSetOfNullableXmls from 'it => it.nullableSetOfNullableXmls' { persisted; }
  }
}
