module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneDecimalsWithScaleOf9_4 {
    Set<Decimal(9)> oneSetOfOneDecimalsWithScaleOf9;

    calculated Set<Decimal(9)> calculatedOneSetOfOneDecimalsWithScaleOf9 from 'it => it.oneSetOfOneDecimalsWithScaleOf9';

    calculated Set<Decimal(9)> persistedOneSetOfOneDecimalsWithScaleOf9 from 'it => it.oneSetOfOneDecimalsWithScaleOf9' { persisted; }
  }
}
