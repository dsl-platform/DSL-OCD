module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableStringsWithMaxLengthOf9_5 {
    Set<String(9)?> oneSetOfNullableStringsWithMaxLengthOf9;

    calculated Set<String(9)?> calculatedOneSetOfNullableStringsWithMaxLengthOf9 from 'it => it.oneSetOfNullableStringsWithMaxLengthOf9';

    calculated Set<String(9)?> persistedOneSetOfNullableStringsWithMaxLengthOf9 from 'it => it.oneSetOfNullableStringsWithMaxLengthOf9' { persisted; }
  }
}
