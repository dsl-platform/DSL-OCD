module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableIps_4 {
    List<Ip?> oneListOfNullableIps;

    calculated List<Ip?> calculatedOneListOfNullableIps from 'it => it.oneListOfNullableIps';

    calculated List<Ip?> persistedOneListOfNullableIps from 'it => it.oneListOfNullableIps' { persisted; }
  }
}
