module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableImages_4 {
    Set<Image?>? nullableSetOfNullableImages;

    calculated Set<Image?>? calculatedNullableSetOfNullableImages from 'it => it.nullableSetOfNullableImages';

    calculated Set<Image?>? persistedNullableSetOfNullableImages from 'it => it.nullableSetOfNullableImages' { persisted; }
  }
}
