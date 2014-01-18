module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableIps_3 {
    Array<Ip?>? nullableArrayOfNullableIps;

    calculated Array<Ip?>? calculatedNullableArrayOfNullableIps from 'it => it.nullableArrayOfNullableIps';

    calculated Array<Ip?>? persistedNullableArrayOfNullableIps from 'it => it.nullableArrayOfNullableIps' { persisted; }
  }
}
