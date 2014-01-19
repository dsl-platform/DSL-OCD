module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableXmls_4 {
    Array<Xml?>? nullableArrayOfNullableXmls;

    calculated Array<Xml?>? calculatedNullableArrayOfNullableXmls from 'it => it.nullableArrayOfNullableXmls';

    calculated Array<Xml?>? persistedNullableArrayOfNullableXmls from 'it => it.nullableArrayOfNullableXmls' { persisted; }
  }
}
