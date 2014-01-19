module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableTexts_4 {
    Array<Text?>? nullableArrayOfNullableTexts;

    calculated Array<Text?>? calculatedNullableArrayOfNullableTexts from 'it => it.nullableArrayOfNullableTexts';

    calculated Array<Text?>? persistedNullableArrayOfNullableTexts from 'it => it.nullableArrayOfNullableTexts' { persisted; }
  }
}
