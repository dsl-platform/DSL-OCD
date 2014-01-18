module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneTexts_3 {
    Array<Text>? nullableArrayOfOneTexts;

    calculated Array<Text>? calculatedNullableArrayOfOneTexts from 'it => it.nullableArrayOfOneTexts';

    calculated Array<Text>? persistedNullableArrayOfOneTexts from 'it => it.nullableArrayOfOneTexts' { persisted; }
  }
}
