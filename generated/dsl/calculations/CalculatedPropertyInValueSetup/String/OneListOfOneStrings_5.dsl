module CalculatedPropertyInValueSetup
{
  value OneListOfOneStrings_5 {
    List<String> oneListOfOneStrings;

    calculated List<String> calculatedOneListOfOneStrings from 'it => it.oneListOfOneStrings';

    calculated List<String> persistedOneListOfOneStrings from 'it => it.oneListOfOneStrings' { persisted; }
  }
}
