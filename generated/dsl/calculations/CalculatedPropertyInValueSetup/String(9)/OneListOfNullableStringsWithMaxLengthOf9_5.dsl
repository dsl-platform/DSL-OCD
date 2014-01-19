module CalculatedPropertyInValueSetup
{
  value OneListOfNullableStringsWithMaxLengthOf9_5 {
    List<String(9)?> oneListOfNullableStringsWithMaxLengthOf9;

    calculated List<String(9)?> calculatedOneListOfNullableStringsWithMaxLengthOf9 from 'it => it.oneListOfNullableStringsWithMaxLengthOf9';

    calculated List<String(9)?> persistedOneListOfNullableStringsWithMaxLengthOf9 from 'it => it.oneListOfNullableStringsWithMaxLengthOf9' { persisted; }
  }
}
