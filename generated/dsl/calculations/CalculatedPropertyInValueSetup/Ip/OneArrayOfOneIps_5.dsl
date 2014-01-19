module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneIps_5 {
    Array<Ip> oneArrayOfOneIps;

    calculated Array<Ip> calculatedOneArrayOfOneIps from 'it => it.oneArrayOfOneIps';

    calculated Array<Ip> persistedOneArrayOfOneIps from 'it => it.oneArrayOfOneIps' { persisted; }
  }
}
