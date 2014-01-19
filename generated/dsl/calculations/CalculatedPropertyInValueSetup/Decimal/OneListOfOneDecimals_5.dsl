module CalculatedPropertyInValueSetup
{
  value OneListOfOneDecimals_5 {
    List<Decimal> oneListOfOneDecimals;

    calculated List<Decimal> calculatedOneListOfOneDecimals from 'it => it.oneListOfOneDecimals';

    calculated List<Decimal> persistedOneListOfOneDecimals from 'it => it.oneListOfOneDecimals' { persisted; }
  }
}
