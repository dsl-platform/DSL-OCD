module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneImages_4 {
    Array<Image>? nullableArrayOfOneImages;

    calculated Array<Image>? calculatedNullableArrayOfOneImages from 'it => it.nullableArrayOfOneImages';

    calculated Array<Image>? persistedNullableArrayOfOneImages from 'it => it.nullableArrayOfOneImages' { persisted; }
  }
}
