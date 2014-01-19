module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableTexts_5 {
    Set<Text?> oneSetOfNullableTexts;

    calculated Set<Text?> calculatedOneSetOfNullableTexts from 'it => it.oneSetOfNullableTexts';

    calculated Set<Text?> persistedOneSetOfNullableTexts from 'it => it.oneSetOfNullableTexts' { persisted; }
  }
}
