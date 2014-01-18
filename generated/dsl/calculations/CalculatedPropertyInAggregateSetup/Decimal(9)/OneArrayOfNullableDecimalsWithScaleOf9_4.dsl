module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableDecimalsWithScaleOf9_4 {
    Array<Decimal(9)?> oneArrayOfNullableDecimalsWithScaleOf9;

    calculated Array<Decimal(9)?> calculatedOneArrayOfNullableDecimalsWithScaleOf9 from 'it => it.oneArrayOfNullableDecimalsWithScaleOf9';

    calculated Array<Decimal(9)?> persistedOneArrayOfNullableDecimalsWithScaleOf9 from 'it => it.oneArrayOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
