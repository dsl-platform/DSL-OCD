module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfOneDecimalsWithScaleOf9_2(oneSetOfOneDecimalsWithScaleOf9) {
    Set<Decimal(9)> oneSetOfOneDecimalsWithScaleOf9;
  }
}
