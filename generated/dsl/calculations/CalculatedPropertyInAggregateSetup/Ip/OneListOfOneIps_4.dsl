module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneIps_4 {
    List<Ip> oneListOfOneIps;

    calculated List<Ip> calculatedOneListOfOneIps from 'it => it.oneListOfOneIps';

    calculated List<Ip> persistedOneListOfOneIps from 'it => it.oneListOfOneIps' { persisted; }
  }
}
