module CalculatedPropertyInValueSetup
{
  value OneSetOfOneStringsWithMaxLengthOf9_5 {
    Set<String(9)> oneSetOfOneStringsWithMaxLengthOf9;

    calculated Set<String(9)> calculatedOneSetOfOneStringsWithMaxLengthOf9 from 'it => it.oneSetOfOneStringsWithMaxLengthOf9';

    calculated Set<String(9)> persistedOneSetOfOneStringsWithMaxLengthOf9 from 'it => it.oneSetOfOneStringsWithMaxLengthOf9' { persisted; }
  }
}
