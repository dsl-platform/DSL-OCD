module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableImages_3 {
    Array<Image?>? nullableArrayOfNullableImages;

    calculated Array<Image?>? calculatedNullableArrayOfNullableImages from 'it => it.nullableArrayOfNullableImages';

    calculated Array<Image?>? persistedNullableArrayOfNullableImages from 'it => it.nullableArrayOfNullableImages' { persisted; }
  }
}
