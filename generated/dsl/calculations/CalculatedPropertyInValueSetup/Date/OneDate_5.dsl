module CalculatedPropertyInValueSetup
{
  value OneDate_5 {
    Date oneDate;

    calculated Date calculatedOneDate from 'it => it.oneDate';

    calculated Date persistedOneDate from 'it => it.oneDate' { persisted; }
  }
}
