module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableXmls_3 {
    List<Xml?>? nullableListOfNullableXmls;

    calculated List<Xml?>? calculatedNullableListOfNullableXmls from 'it => it.nullableListOfNullableXmls';

    calculated List<Xml?>? persistedNullableListOfNullableXmls from 'it => it.nullableListOfNullableXmls' { persisted; }
  }
}
