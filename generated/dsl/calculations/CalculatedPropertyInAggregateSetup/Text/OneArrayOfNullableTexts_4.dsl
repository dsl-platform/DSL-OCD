module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableTexts_4 {
    Array<Text?> oneArrayOfNullableTexts;

    calculated Array<Text?> calculatedOneArrayOfNullableTexts from 'it => it.oneArrayOfNullableTexts';

    calculated Array<Text?> persistedOneArrayOfNullableTexts from 'it => it.oneArrayOfNullableTexts' { persisted; }
  }
}
