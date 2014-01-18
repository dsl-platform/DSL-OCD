module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableDecimalsWithScaleOf9_2(oneArrayOfNullableDecimalsWithScaleOf9) {
    Array<Decimal(9)?> oneArrayOfNullableDecimalsWithScaleOf9;
  }
}
