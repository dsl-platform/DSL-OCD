module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableImages_4 {
    Set<Image?> oneSetOfNullableImages;

    calculated Set<Image?> calculatedOneSetOfNullableImages from 'it => it.oneSetOfNullableImages';

    calculated Set<Image?> persistedOneSetOfNullableImages from 'it => it.oneSetOfNullableImages' { persisted; }
  }
}
