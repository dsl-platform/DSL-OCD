module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableIps_5 {
    Set<Ip?> oneSetOfNullableIps;

    calculated Set<Ip?> calculatedOneSetOfNullableIps from 'it => it.oneSetOfNullableIps';

    calculated Set<Ip?> persistedOneSetOfNullableIps from 'it => it.oneSetOfNullableIps' { persisted; }
  }
}
