module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneArrayOfOneStringsWithMaxLengthOf9_2(oneArrayOfOneStringsWithMaxLengthOf9) {
    Array<String(9)> oneArrayOfOneStringsWithMaxLengthOf9;
  }
}
