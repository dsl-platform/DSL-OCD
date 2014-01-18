module CalculatedPropertyInAggregateSetup
{
  aggregate OneMoney_4 {
    Money oneMoney;

    calculated Money calculatedOneMoney from 'it => it.oneMoney';

    calculated Money persistedOneMoney from 'it => it.oneMoney' { persisted; }
  }
}
