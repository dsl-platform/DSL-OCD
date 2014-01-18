module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneDecimals_4 {
    Array<Decimal> oneArrayOfOneDecimals;

    calculated Array<Decimal> calculatedOneArrayOfOneDecimals from 'it => it.oneArrayOfOneDecimals';

    calculated Array<Decimal> persistedOneArrayOfOneDecimals from 'it => it.oneArrayOfOneDecimals' { persisted; }
  }
}
