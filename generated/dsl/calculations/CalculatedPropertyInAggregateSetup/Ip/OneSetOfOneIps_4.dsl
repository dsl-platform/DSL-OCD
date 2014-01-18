module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneIps_4 {
    Set<Ip> oneSetOfOneIps;

    calculated Set<Ip> calculatedOneSetOfOneIps from 'it => it.oneSetOfOneIps';

    calculated Set<Ip> persistedOneSetOfOneIps from 'it => it.oneSetOfOneIps' { persisted; }
  }
}
