module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableDecimalsWithScaleOf9_4 {
    List<Decimal(9)?> oneListOfNullableDecimalsWithScaleOf9;

    calculated List<Decimal(9)?> calculatedOneListOfNullableDecimalsWithScaleOf9 from 'it => it.oneListOfNullableDecimalsWithScaleOf9';

    calculated List<Decimal(9)?> persistedOneListOfNullableDecimalsWithScaleOf9 from 'it => it.oneListOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
