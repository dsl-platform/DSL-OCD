module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableDecimalsWithScaleOf9_5 {
    Array<Decimal(9)?> oneArrayOfNullableDecimalsWithScaleOf9;

    calculated Array<Decimal(9)?> calculatedOneArrayOfNullableDecimalsWithScaleOf9 from 'it => it.oneArrayOfNullableDecimalsWithScaleOf9';

    calculated Array<Decimal(9)?> persistedOneArrayOfNullableDecimalsWithScaleOf9 from 'it => it.oneArrayOfNullableDecimalsWithScaleOf9' { persisted; }
  }
}
