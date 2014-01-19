module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneTexts_5 {
    Array<Text> oneArrayOfOneTexts;

    calculated Array<Text> calculatedOneArrayOfOneTexts from 'it => it.oneArrayOfOneTexts';

    calculated Array<Text> persistedOneArrayOfOneTexts from 'it => it.oneArrayOfOneTexts' { persisted; }
  }
}
