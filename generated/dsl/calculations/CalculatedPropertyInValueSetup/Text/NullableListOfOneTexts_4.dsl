module CalculatedPropertyInValueSetup
{
  value NullableListOfOneTexts_4 {
    List<Text>? nullableListOfOneTexts;

    calculated List<Text>? calculatedNullableListOfOneTexts from 'it => it.nullableListOfOneTexts';

    calculated List<Text>? persistedNullableListOfOneTexts from 'it => it.nullableListOfOneTexts' { persisted; }
  }
}
