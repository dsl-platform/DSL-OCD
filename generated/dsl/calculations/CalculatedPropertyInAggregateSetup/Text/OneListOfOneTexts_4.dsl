module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneTexts_4 {
    List<Text> oneListOfOneTexts;

    calculated List<Text> calculatedOneListOfOneTexts from 'it => it.oneListOfOneTexts';

    calculated List<Text> persistedOneListOfOneTexts from 'it => it.oneListOfOneTexts' { persisted; }
  }
}
