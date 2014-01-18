module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableStringsWithMaxLengthOf9_4 {
    List<String(9)?> oneListOfNullableStringsWithMaxLengthOf9;

    calculated List<String(9)?> calculatedOneListOfNullableStringsWithMaxLengthOf9 from 'it => it.oneListOfNullableStringsWithMaxLengthOf9';

    calculated List<String(9)?> persistedOneListOfNullableStringsWithMaxLengthOf9 from 'it => it.oneListOfNullableStringsWithMaxLengthOf9' { persisted; }
  }
}
