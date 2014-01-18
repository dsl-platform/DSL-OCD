module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfOneStringsWithMaxLengthOf9_2(oneSetOfOneStringsWithMaxLengthOf9) {
    Set<String(9)> oneSetOfOneStringsWithMaxLengthOf9;
  }
}
