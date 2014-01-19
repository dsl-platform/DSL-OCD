module CalculatedPropertyInValueSetup
{
  value OneListOfOneIps_5 {
    List<Ip> oneListOfOneIps;

    calculated List<Ip> calculatedOneListOfOneIps from 'it => it.oneListOfOneIps';

    calculated List<Ip> persistedOneListOfOneIps from 'it => it.oneListOfOneIps' { persisted; }
  }
}
