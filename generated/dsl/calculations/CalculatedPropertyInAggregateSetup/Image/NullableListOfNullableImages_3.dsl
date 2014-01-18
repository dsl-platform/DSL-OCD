module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableImages_3 {
    List<Image?>? nullableListOfNullableImages;

    calculated List<Image?>? calculatedNullableListOfNullableImages from 'it => it.nullableListOfNullableImages';

    calculated List<Image?>? persistedNullableListOfNullableImages from 'it => it.nullableListOfNullableImages' { persisted; }
  }
}
