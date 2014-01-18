module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableTexts_4 {
    Set<Text?> oneSetOfNullableTexts;

    calculated Set<Text?> calculatedOneSetOfNullableTexts from 'it => it.oneSetOfNullableTexts';

    calculated Set<Text?> persistedOneSetOfNullableTexts from 'it => it.oneSetOfNullableTexts' { persisted; }
  }
}
