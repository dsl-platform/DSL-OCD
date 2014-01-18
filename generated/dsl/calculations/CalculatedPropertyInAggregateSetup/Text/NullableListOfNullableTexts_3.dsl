module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableTexts_3 {
    List<Text?>? nullableListOfNullableTexts;

    calculated List<Text?>? calculatedNullableListOfNullableTexts from 'it => it.nullableListOfNullableTexts';

    calculated List<Text?>? persistedNullableListOfNullableTexts from 'it => it.nullableListOfNullableTexts' { persisted; }
  }
}
