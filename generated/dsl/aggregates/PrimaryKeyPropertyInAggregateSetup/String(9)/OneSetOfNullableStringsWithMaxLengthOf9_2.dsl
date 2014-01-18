module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfNullableStringsWithMaxLengthOf9_2(oneSetOfNullableStringsWithMaxLengthOf9) {
    Set<String(9)?> oneSetOfNullableStringsWithMaxLengthOf9;
  }
}
