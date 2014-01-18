module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneMonies_4 {
    Array<Money> oneArrayOfOneMonies;

    calculated Array<Money> calculatedOneArrayOfOneMonies from 'it => it.oneArrayOfOneMonies';

    calculated Array<Money> persistedOneArrayOfOneMonies from 'it => it.oneArrayOfOneMonies' { persisted; }
  }
}
