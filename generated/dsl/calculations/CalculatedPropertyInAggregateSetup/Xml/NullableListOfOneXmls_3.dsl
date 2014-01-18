module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneXmls_3 {
    List<Xml>? nullableListOfOneXmls;

    calculated List<Xml>? calculatedNullableListOfOneXmls from 'it => it.nullableListOfOneXmls';

    calculated List<Xml>? persistedNullableListOfOneXmls from 'it => it.nullableListOfOneXmls' { persisted; }
  }
}
