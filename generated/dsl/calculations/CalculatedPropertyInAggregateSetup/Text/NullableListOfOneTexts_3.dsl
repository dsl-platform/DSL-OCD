module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneTexts_3 {
    List<Text>? nullableListOfOneTexts;

    calculated List<Text>? calculatedNullableListOfOneTexts from 'it => it.nullableListOfOneTexts';

    calculated List<Text>? persistedNullableListOfOneTexts from 'it => it.nullableListOfOneTexts' { persisted; }
  }
}
