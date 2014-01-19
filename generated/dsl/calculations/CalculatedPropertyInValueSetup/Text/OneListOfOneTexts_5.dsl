module CalculatedPropertyInValueSetup
{
  value OneListOfOneTexts_5 {
    List<Text> oneListOfOneTexts;

    calculated List<Text> calculatedOneListOfOneTexts from 'it => it.oneListOfOneTexts';

    calculated List<Text> persistedOneListOfOneTexts from 'it => it.oneListOfOneTexts' { persisted; }
  }
}
