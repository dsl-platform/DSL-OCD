module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableStringsWithMaxLengthOf9_2(oneArrayOfNullableStringsWithMaxLengthOf9) {
    Array<String(9)?> oneArrayOfNullableStringsWithMaxLengthOf9;
  }
}
