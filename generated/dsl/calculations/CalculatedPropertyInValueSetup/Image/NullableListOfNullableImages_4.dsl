module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableImages_4 {
    List<Image?>? nullableListOfNullableImages;

    calculated List<Image?>? calculatedNullableListOfNullableImages from 'it => it.nullableListOfNullableImages';

    calculated List<Image?>? persistedNullableListOfNullableImages from 'it => it.nullableListOfNullableImages' { persisted; }
  }
}
