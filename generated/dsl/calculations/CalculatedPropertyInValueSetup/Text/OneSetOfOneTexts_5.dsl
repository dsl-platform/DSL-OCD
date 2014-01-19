module CalculatedPropertyInValueSetup
{
  value OneSetOfOneTexts_5 {
    Set<Text> oneSetOfOneTexts;

    calculated Set<Text> calculatedOneSetOfOneTexts from 'it => it.oneSetOfOneTexts';

    calculated Set<Text> persistedOneSetOfOneTexts from 'it => it.oneSetOfOneTexts' { persisted; }
  }
}
