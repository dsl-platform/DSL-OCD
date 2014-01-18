module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableDecimalsWithScaleOf9_4 {
    Set<Decimal(9)?> oneSetOfNullableDecimalsWithScaleOf9;

    calculated Set<Decimal(9)?> calculatedOneSetOfNullableDecimalsWithScaleOf9 from 'it => it.oneSetOfNullableDecimalsWithScaleOf9';

    calculated Set<Decimal(9)?> persistedOneSetOfNullableDecimalsWithScaleOf9 from 'it => it.oneSetOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
