module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneXmls_3 {
    Array<Xml>? nullableArrayOfOneXmls;

    calculated Array<Xml>? calculatedNullableArrayOfOneXmls from 'it => it.nullableArrayOfOneXmls';

    calculated Array<Xml>? persistedNullableArrayOfOneXmls from 'it => it.nullableArrayOfOneXmls' { persisted; }
  }
}
