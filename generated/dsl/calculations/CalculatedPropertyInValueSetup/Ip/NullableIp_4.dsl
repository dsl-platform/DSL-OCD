module CalculatedPropertyInValueSetup
{
  value NullableIp_4 {
    Ip? nullableIp;

    calculated Ip? calculatedNullableIp from 'it => it.nullableIp';

    calculated Ip? persistedNullableIp from 'it => it.nullableIp' { persisted; }
  }
}
