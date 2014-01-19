module CalculatedPropertyInValueSetup
{
  value OneSetOfOneDecimalsWithScaleOf9_5 {
    Set<Decimal(9)> oneSetOfOneDecimalsWithScaleOf9;

    calculated Set<Decimal(9)> calculatedOneSetOfOneDecimalsWithScaleOf9 from 'it => it.oneSetOfOneDecimalsWithScaleOf9';

    calculated Set<Decimal(9)> persistedOneSetOfOneDecimalsWithScaleOf9 from 'it => it.oneSetOfOneDecimalsWithScaleOf9' { persisted; }
  }
}
