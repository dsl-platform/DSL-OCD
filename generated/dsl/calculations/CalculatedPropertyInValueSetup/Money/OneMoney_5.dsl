module CalculatedPropertyInValueSetup
{
  value OneMoney_5 {
    Money oneMoney;

    calculated Money calculatedOneMoney from 'it => it.oneMoney';

    calculated Money persistedOneMoney from 'it => it.oneMoney' { persisted; }
  }
}
