module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneIps_4 {
    Array<Ip> oneArrayOfOneIps;

    calculated Array<Ip> calculatedOneArrayOfOneIps from 'it => it.oneArrayOfOneIps';

    calculated Array<Ip> persistedOneArrayOfOneIps from 'it => it.oneArrayOfOneIps' { persisted; }
  }
}
