module CalculatedPropertyInValueSetup
{
  value OneIp_5 {
    Ip oneIp;

    calculated Ip calculatedOneIp from 'it => it.oneIp';

    calculated Ip persistedOneIp from 'it => it.oneIp' { persisted; }
  }
}
