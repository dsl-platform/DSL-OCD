module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableTexts_4 {
    List<Text?> oneListOfNullableTexts;

    calculated List<Text?> calculatedOneListOfNullableTexts from 'it => it.oneListOfNullableTexts';

    calculated List<Text?> persistedOneListOfNullableTexts from 'it => it.oneListOfNullableTexts' { persisted; }
  }
}
