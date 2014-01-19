module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableIps_4 {
    Array<Ip?>? nullableArrayOfNullableIps;

    calculated Array<Ip?>? calculatedNullableArrayOfNullableIps from 'it => it.nullableArrayOfNullableIps';

    calculated Array<Ip?>? persistedNullableArrayOfNullableIps from 'it => it.nullableArrayOfNullableIps' { persisted; }
  }
}
