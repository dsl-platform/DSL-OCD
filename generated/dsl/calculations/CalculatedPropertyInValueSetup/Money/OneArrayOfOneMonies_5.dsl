module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneMonies_5 {
    Array<Money> oneArrayOfOneMonies;

    calculated Array<Money> calculatedOneArrayOfOneMonies from 'it => it.oneArrayOfOneMonies';

    calculated Array<Money> persistedOneArrayOfOneMonies from 'it => it.oneArrayOfOneMonies' { persisted; }
  }
}
