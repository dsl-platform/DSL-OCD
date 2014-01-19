module CalculatedPropertyInValueSetup
{
  value OneListOfNullableIps_5 {
    List<Ip?> oneListOfNullableIps;

    calculated List<Ip?> calculatedOneListOfNullableIps from 'it => it.oneListOfNullableIps';

    calculated List<Ip?> persistedOneListOfNullableIps from 'it => it.oneListOfNullableIps' { persisted; }
  }
}
