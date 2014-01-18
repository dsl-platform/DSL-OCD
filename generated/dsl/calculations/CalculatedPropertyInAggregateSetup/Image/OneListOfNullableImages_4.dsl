module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableImages_4 {
    List<Image?> oneListOfNullableImages;

    calculated List<Image?> calculatedOneListOfNullableImages from 'it => it.oneListOfNullableImages';

    calculated List<Image?> persistedOneListOfNullableImages from 'it => it.oneListOfNullableImages' { persisted; }
  }
}
