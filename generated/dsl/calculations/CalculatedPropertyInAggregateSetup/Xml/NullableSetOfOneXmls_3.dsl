module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneXmls_3 {
    Set<Xml>? nullableSetOfOneXmls;

    calculated Set<Xml>? calculatedNullableSetOfOneXmls from 'it => it.nullableSetOfOneXmls';

    calculated Set<Xml>? persistedNullableSetOfOneXmls from 'it => it.nullableSetOfOneXmls' { persisted; }
  }
}
