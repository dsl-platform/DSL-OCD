module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableStringsWithMaxLengthOf9_5 {
    Array<String(9)?> oneArrayOfNullableStringsWithMaxLengthOf9;

    calculated Array<String(9)?> calculatedOneArrayOfNullableStringsWithMaxLengthOf9 from 'it => it.oneArrayOfNullableStringsWithMaxLengthOf9';

    calculated Array<String(9)?> persistedOneArrayOfNullableStringsWithMaxLengthOf9 from 'it => it.oneArrayOfNullableStringsWithMaxLengthOf9' { persisted; }
  }
}
