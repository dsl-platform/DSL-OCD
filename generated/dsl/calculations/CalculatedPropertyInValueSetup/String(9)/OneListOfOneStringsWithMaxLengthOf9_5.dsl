module CalculatedPropertyInValueSetup
{
  value OneListOfOneStringsWithMaxLengthOf9_5 {
    List<String(9)> oneListOfOneStringsWithMaxLengthOf9;

    calculated List<String(9)> calculatedOneListOfOneStringsWithMaxLengthOf9 from 'it => it.oneListOfOneStringsWithMaxLengthOf9';

    calculated List<String(9)> persistedOneListOfOneStringsWithMaxLengthOf9 from 'it => it.oneListOfOneStringsWithMaxLengthOf9' { persisted; }
  }
}
