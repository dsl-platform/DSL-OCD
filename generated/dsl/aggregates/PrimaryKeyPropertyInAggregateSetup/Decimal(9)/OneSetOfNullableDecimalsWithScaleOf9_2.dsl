module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfNullableDecimalsWithScaleOf9_2(oneSetOfNullableDecimalsWithScaleOf9) {
    Set<Decimal(9)?> oneSetOfNullableDecimalsWithScaleOf9;
  }
}
