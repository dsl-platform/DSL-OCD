module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableTexts_3 {
    Array<Text?>? nullableArrayOfNullableTexts;

    calculated Array<Text?>? calculatedNullableArrayOfNullableTexts from 'it => it.nullableArrayOfNullableTexts';

    calculated Array<Text?>? persistedNullableArrayOfNullableTexts from 'it => it.nullableArrayOfNullableTexts' { persisted; }
  }
}
