module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableIps_5 {
    Array<Ip?> oneArrayOfNullableIps;

    calculated Array<Ip?> calculatedOneArrayOfNullableIps from 'it => it.oneArrayOfNullableIps';

    calculated Array<Ip?> persistedOneArrayOfNullableIps from 'it => it.oneArrayOfNullableIps' { persisted; }
  }
}
