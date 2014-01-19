module CalculatedPropertyInValueSetup
{
  value OneSetOfOneDecimals_5 {
    Set<Decimal> oneSetOfOneDecimals;

    calculated Set<Decimal> calculatedOneSetOfOneDecimals from 'it => it.oneSetOfOneDecimals';

    calculated Set<Decimal> persistedOneSetOfOneDecimals from 'it => it.oneSetOfOneDecimals' { persisted; }
  }
}
