module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneTexts_3 {
    Set<Text>? nullableSetOfOneTexts;

    calculated Set<Text>? calculatedNullableSetOfOneTexts from 'it => it.nullableSetOfOneTexts';

    calculated Set<Text>? persistedNullableSetOfOneTexts from 'it => it.nullableSetOfOneTexts' { persisted; }
  }
}
