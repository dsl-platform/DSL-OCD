module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneImages_3 {
    Array<Image>? nullableArrayOfOneImages;

    calculated Array<Image>? calculatedNullableArrayOfOneImages from 'it => it.nullableArrayOfOneImages';

    calculated Array<Image>? persistedNullableArrayOfOneImages from 'it => it.nullableArrayOfOneImages' { persisted; }
  }
}
