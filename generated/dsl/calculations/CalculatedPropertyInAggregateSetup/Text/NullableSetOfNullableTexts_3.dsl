module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableTexts_3 {
    Set<Text?>? nullableSetOfNullableTexts;

    calculated Set<Text?>? calculatedNullableSetOfNullableTexts from 'it => it.nullableSetOfNullableTexts';

    calculated Set<Text?>? persistedNullableSetOfNullableTexts from 'it => it.nullableSetOfNullableTexts' { persisted; }
  }
}
