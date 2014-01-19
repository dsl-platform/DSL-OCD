module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableImages_5 {
    Set<Image?> oneSetOfNullableImages;

    calculated Set<Image?> calculatedOneSetOfNullableImages from 'it => it.oneSetOfNullableImages';

    calculated Set<Image?> persistedOneSetOfNullableImages from 'it => it.oneSetOfNullableImages' { persisted; }
  }
}
