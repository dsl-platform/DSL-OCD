module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneIps_3 {
    Array<Ip>? nullableArrayOfOneIps;

    calculated Array<Ip>? calculatedNullableArrayOfOneIps from 'it => it.nullableArrayOfOneIps';

    calculated Array<Ip>? persistedNullableArrayOfOneIps from 'it => it.nullableArrayOfOneIps' { persisted; }
  }
}
