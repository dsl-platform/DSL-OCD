module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableDecimalsWithScaleOf9_5 {
    Set<Decimal(9)?> oneSetOfNullableDecimalsWithScaleOf9;

    calculated Set<Decimal(9)?> calculatedOneSetOfNullableDecimalsWithScaleOf9 from 'it => it.oneSetOfNullableDecimalsWithScaleOf9';

    calculated Set<Decimal(9)?> persistedOneSetOfNullableDecimalsWithScaleOf9 from 'it => it.oneSetOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
