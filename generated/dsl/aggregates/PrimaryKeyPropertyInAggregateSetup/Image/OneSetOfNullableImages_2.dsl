module PrimaryKeyPropertyInAggregateSetup
{
  aggregate OneSetOfNullableImages_2(oneSetOfNullableImages) {
    Set<Image?> oneSetOfNullableImages;
  }
}
