module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableIps_4 {
    Array<Ip?> oneArrayOfNullableIps;

    calculated Array<Ip?> calculatedOneArrayOfNullableIps from 'it => it.oneArrayOfNullableIps';

    calculated Array<Ip?> persistedOneArrayOfNullableIps from 'it => it.oneArrayOfNullableIps' { persisted; }
  }
}
