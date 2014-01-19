module CalculatedPropertyInValueSetup
{
  value NullableListOfOneXmls_4 {
    List<Xml>? nullableListOfOneXmls;

    calculated List<Xml>? calculatedNullableListOfOneXmls from 'it => it.nullableListOfOneXmls';

    calculated List<Xml>? persistedNullableListOfOneXmls from 'it => it.nullableListOfOneXmls' { persisted; }
  }
}
