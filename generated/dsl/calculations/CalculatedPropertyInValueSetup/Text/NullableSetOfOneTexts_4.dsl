module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneTexts_4 {
    Set<Text>? nullableSetOfOneTexts;

    calculated Set<Text>? calculatedNullableSetOfOneTexts from 'it => it.nullableSetOfOneTexts';

    calculated Set<Text>? persistedNullableSetOfOneTexts from 'it => it.nullableSetOfOneTexts' { persisted; }
  }
}
