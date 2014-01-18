module CalculatedPropertyInAggregateSetup
{
  aggregate OneDate_4 {
    Date oneDate;

    calculated Date calculatedOneDate from 'it => it.oneDate';

    calculated Date persistedOneDate from 'it => it.oneDate' { persisted; }
  }
}
